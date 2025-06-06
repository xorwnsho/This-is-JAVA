package stream.sec07;

import java.util.ArrayList;
import java.util.List;

public class SortingMain2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("홍길동", 30));
        list.add(new Student("신용권", 10));
        list.add(new Student("유미선", 20));

        list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
        System.out.println();

        list.stream()
                .sorted(((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore())))
                .forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
    }
}
