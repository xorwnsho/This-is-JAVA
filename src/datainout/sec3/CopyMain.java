package datainout.sec3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyMain {
    public static void main(String[] args) throws Exception{
        String originalFileName = "/Users/juntaek/Studyjava/file_in_out/test1.jpeg";
        String targetFileName = "/Users/juntaek/Studyjava/file_in_out/test2.jpeg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];

        while(true){
            int num = is.read(data);
            if(num == -1) break;
            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
