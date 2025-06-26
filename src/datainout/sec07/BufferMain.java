package datainout.sec07;

import java.io.*;

public class BufferMain {
    public static void main(String[] args) throws Exception{
        String originalFilePath1 = "/Users/juntaek/Studyjava/file_in_out/originalFile1.jpeg";
        String targetFilePath1 = "/Users/juntaek/Studyjava/file_in_out/targetFile1.jpeg";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = "/Users/juntaek/Studyjava/file_in_out/originalFile2.jpeg";
        String targetFilePath2 = "/Users/juntaek/Studyjava/file_in_out/targetFile2.jpeg";

        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);

        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용 :\t " + nonBufferTime + "ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용 :\t " + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while(true){
            int data = is.read();;
            if(data == -1) break;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();
        return (end - start);
    }
}
