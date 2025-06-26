package datainout.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("/Users/juntaek/Studyjava/file_in_out/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("오준택");
        dos.writeDouble(98.8);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/juntaek/Studyjava/file_in_out/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int grade = dis.readInt();
            System.out.println(name + "\t" + score + "\t" + grade);
        }

        dis.close();
        fis.close();
    }
}
