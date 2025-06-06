package stream.sec07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 30));
        list.add(new Student("신용권", 10));
        list.add(new Student("유미선", 20));
//
//        list.stream()
//                .sorted()
//                .forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
//        System.out.println();
//
//        list.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
    }
}
