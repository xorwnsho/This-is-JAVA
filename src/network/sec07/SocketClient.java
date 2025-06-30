package network.sec07;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
    ChatServer chatServer;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;


    public SocketClient(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive();
        } catch (IOException e) {
        }
    }

    // 클라이언트가 보낸 JSON 메시지를 읽는 역할.
    public void receive() {
        chatServer.threadPool.execute(() -> {
            try {
                while (true) {
                    // dis.readUTF() 로 JSON을 읽음
                    String receiveJson = dis.readUTF();


                    // JSON을 읽고 JSONObject를 파싱해 command 값을 얻어냄.
                    JSONObject jsonObject = new JSONObject(receiveJson);
                    String command = jsonObject.getString("command");

                    switch (command) {
                        case "incoming":
                            // 대화명을 키값인 "data"를 통해 얻음
                            this.chatName = jsonObject.getString("data");
                            chatServer.sendToAll(this, " 들어오셨습니다.");
                            chatServer.addSocketClient(this);
                            break;
                        case "message":
                            String message = jsonObject.getString("data");
                            chatServer.sendToAll(this, message);
                            break;
                    }
                }
            } catch (IOException e) {
                chatServer.sendToAll(this, " 나가셨습니다.");
                chatServer.removeSocketClient(this);
            }
        });
    }

    // send() 메서드는 연결된 클라이언트로, JSON 메시지를 보내는 역할. ChatServer의 sendToAll() 메서드에서 호출됨
    public void send(String json){
        try{
            dos.writeUTF(json);
            dos.flush();
        } catch (IOException e){}
    }

    public void close(){
        try{
            socket.close();
        } catch (IOException e) {

        }
    }
}
