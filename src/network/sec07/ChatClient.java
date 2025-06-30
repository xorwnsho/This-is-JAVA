package network.sec07;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    // 연경 요청과 연결을 끊을 때 필요한 Socket
    Socket socket;

    // dis, dos -> 문자열을 읽고 보내기 위한 보조 스트림
    DataInputStream dis;
    DataOutputStream dos;
    String chatName;

    public void connect() throws IOException {
        // 채팅 서버에 연결 요청
        socket = new Socket("localhost", 50001);
        // 문자열 입출력을 위해 dis, dos 필드 생성
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");
    }

    public void receive(){
        Thread thread = new Thread(() -> {
            try{
                while(true){
                    // readUTF로 JSON을 읽고 JSONObject로 파싱해서 각각 얻어냄.
                    String json = dis.readUTF();
                    JSONObject root = new JSONObject(json);
                    String clientIp = root.getString("clientIp");
                    String chatName = root.getString("chatName");
                    String message = root.getString("message");

                    System.out.println("<" + chatName + "@" + clientIp + " >  " + message);
                }
            } // 서버와 통신이 끊어지면 dis.readUTF에서 IOExpction이 발생.
            catch(Exception e){
                System.out.println("[클라이언트] 서버 연결 끊김");
                System.exit(0);
            }
        });
        thread.start();
    }

    // send()로 서버로 JSON 메시지를 보내는 역할 -> main 메서드에서 키보드로 입력한 메시지를 보낼 때 호출
    public void send(String json) throws IOException{
        dos.writeUTF(json);
        dos.flush();
    }

    // Socket의 close() 메서드를 호출해서 서버와 연결을 끊음.
    // main 메서드에서 q가 입력되었을 때 채팅을 종료하기 위해 호출
    public void unconnect() throws IOException{
        socket.close();
    }

    public static void main(String[] args) {
        try{

            // chatClient를 생성하고, 채팅 서버와 연결하기 위해 connect() 메서드 호출
            ChatClient chatClient = new ChatClient();
            chatClient.connect();

            Scanner scanner = new Scanner(System.in);
            System.out.println("대화명 입력 : ");
            chatClient.chatName = scanner.nextLine();

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("command", "incoming");
            jsonObject.put("data", chatClient.chatName);
            String json = jsonObject.toString();
            chatClient.send(json);

            // 위에 까지가
            // {
            //      "command": "incoming",
            //      "data": "winter"
            // } 이런 JSON 형식으로 대화명을 서버로 보내기 위한 코드

            // 채팅 서버에서 보내는 메시지를 받기 위해 receive() 호출
            chatClient.receive();

            System.out.println("-----------------------------------");
            System.out.println("보낼 메시지를 입력하고 Enter");
            System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
            System.out.println("-----------------------------------");

            // 사용자가 키보드로 메시지를 입력하면 JSON 메시지를 생성해서 보내는 코드
            while(true){
                String message = scanner.nextLine();
                if(message.toLowerCase().equals("q")){
                    break;
                } else{
                    jsonObject = new JSONObject();
                    jsonObject.put("command", "message");
                    jsonObject.put("data", message);
                    json = jsonObject.toString();
                    chatClient.send(json);
                }
            }

            // 만약 사용자가 q를 입력하면 unconnect() 메서드를 호출하고 클라이언트 종료
            scanner.close();
            chatClient.unconnect();
        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안됨");
        }
    }
}
