package datainout.sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMain2 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/juntaek/Studyjava/file_in_out/test2.db");

            byte[] array = {10, 20, 30};

            os.write(array);

            os.flush();
            os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
