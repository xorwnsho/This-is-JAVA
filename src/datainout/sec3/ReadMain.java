package datainout.sec3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMain {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/juntaek/Studyjava/file_in_out/test1.db");
            while(true){
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
