package datainout.sec04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteMain {
    public static void main(String[] args) {
        try{
            Writer writer = new FileWriter("/Users/juntaek/Studyjava/file_in_out/test.txt");

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            writer.write("FGH");

            writer.flush();

            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
