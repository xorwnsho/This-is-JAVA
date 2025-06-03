package stream.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("김자바");

        Stream<String> stream = set.stream();
        // 람다식 요소 처리 방법
        stream.forEach(name -> System.out.println(name));
    }
}
