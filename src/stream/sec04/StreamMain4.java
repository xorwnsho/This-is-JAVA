package stream.sec04;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamMain4 {
    public static void main(String[] args) throws Exception {
        // data.txt 파일의 경로(Path) 객체 얻기
        Path path = Paths.get(StreamMain4.class.getResource("data.txt").toURI());
        //
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
