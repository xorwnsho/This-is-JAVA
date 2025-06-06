package stream.sec06;

import java.util.ArrayList;
import java.util.List;

public class MapMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 85));
        list.add(new Student("홍길동", 92));
        list.add(new Student("홍길동", 97));

        list.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
    }
}
