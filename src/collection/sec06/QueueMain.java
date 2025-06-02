package collection.sec06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Message> messageBox = new LinkedList<>();

        messageBox.offer(new Message("sendMail", "홍길동"));
        messageBox.offer(new Message("sendSMS", "신용권"));
        messageBox.offer(new Message("sendKakaotalk", "김자바"));

        while (!messageBox.isEmpty()) {
            Message message = messageBox.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
