package datainout.sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteMain {
    public static void main(String[] args) {
        try{
            OutputStream out = new FileOutputStream("/Users/juntaek/Studyjava/file_in_out/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            out.write(a);
            out.write(b);
            out.write(c);

            out.flush();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
