package datainout.sec3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMain2 {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/juntaek/Studyjava/file_in_out/test2.db");

            byte[] data = new byte[2];

             while(true){
                 int num = is.read(data);
                 if(num == -1) break;
                 for (int i = 0; i < num; i++) {
                     System.out.println(data[i]);
                 }
             }
             is.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
