package datainout.sec11;

import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.SimpleFileVisitor;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
    public static void main(String[] args) throws Exception{
        File dir = new File("/Users/juntaek/Studyjava/file_in_out/images");
        File file1 = new File("/Users/juntaek/Studyjava/file_in_out/images/file1.txt");
        File file2 = new File("/Users/juntaek/Studyjava/file_in_out/images/file2.txt");
        File file3 = new File("/Users/juntaek/Studyjava/file_in_out/images/file3.txt");

        if(dir.exists() == false){ dir.mkdirs();}
        if(file1.exists() == false){ file1.createNewFile();}
        if(file1.exists() == false){ file2.createNewFile();}
        if(file1.exists() == false){ file3.createNewFile();}

        File temp = new File("/Users/juntaek/Studyjava/file_in_out");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.printf("%-10s%-20s","<DIR>", file.getName());
            } else{
                System.out.printf("%-10s%-20s",file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
