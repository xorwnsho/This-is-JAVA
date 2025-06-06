package stream.sec11;

import java.util.ArrayList;
import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 92));
        list.add(new Student("신용권", 95));
        list.add(new Student("감자바", 88));

        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
