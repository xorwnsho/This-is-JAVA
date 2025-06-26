package datainout.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadMain {
    public static void main(String[] args) {
        try{
            Reader reader = null;

            reader = new FileReader("/Users/juntaek/Studyjava/file_in_out/test.txt");
            while(true){
                int data = reader.read();
                if(data == -1) break;
                System.out.print((char)data);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("/Users/juntaek/Studyjava/file_in_out/test.txt");
            char[] data = new char[100];
            while(true){
                // 읽은 문자들을 매개값으로 주어진 문자 배열에 저장하고 읽은 문자 수를 리턴
                int num = reader.read(data);
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
