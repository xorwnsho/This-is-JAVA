package network.sec07;

import org.json.JSONObject;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    // 클라이언트의 연결 요청을 수락하기 위한 역할
    ServerSocket serverSocket;

    // 100개의 클라이언트가 동시에 채팅할 수 있도록
    ExecutorService threadPool = Executors.newFixedThreadPool(100);

    // chatRoom -> 통신용 SocketClient를 관리하는 동기화된 Map 컬렉션
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());


    public void start() throws IOException {

        // 50001번 Port에 바인딩하는 ServerSocket을 생성하고 작업 스레드가 처리한 Runnable을 람다식으로 표현
        serverSocket = new ServerSocket(50001);
        System.out.println("[서버] 시작됨");

        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    // accept()로 연결을 수락하고, 통신용 SocketClient를 반복해서 생성
                    Socket socket = serverSocket.accept();
                    SocketClient sc = new SocketClient(this, socket);
                }
            } catch (IOException e) {
            }
        });
        thread.start();
    }

    // 연결된 클라이언트의 SocketClient를 chatRoom에 추가하는 역할
// key : chatName@clientIp, value : SocketClient
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장 : " + key);
        System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
    }

    // 연결이 끊긴 클라이언트의 SocketClient를 chatRoom에서 제거하는 역할
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("나감 : " + key);
        System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
    }

    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        // 위에서 JSON 메시지를 생성해 채팅방에 있는 모든 클라이언트에게 보내는 역할.
        Collection<SocketClient> socketClients = chatRoom.values();
        for (SocketClient sc : socketClients) {
            if (sc == sender) continue;
            sc.send(json);
        }
    }

    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            // chatRoom.values()로 Collection<SocketClient>를 얻고
            // 요소 스트림을 이용해서 전체 SocketClient의 close() 메서드 호출
            chatRoom.values().stream().forEach(sc -> sc.close());
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        try {
            ChatServer chatServer = new ChatServer();
            chatServer.start();

            System.out.println("------------------------------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter");
            System.out.println("------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String key = scanner.nextLine();
                if (key.equals("q")) break;
            }

            scanner.close();
            chatServer.stop();
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
        }
    }
}