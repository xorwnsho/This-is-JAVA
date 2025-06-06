package stream.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("b");

        list.stream()
                .distinct()
                .forEach(name -> System.out.println(name));
        System.out.println();

        list.stream()
                .filter(name -> name.startsWith("a"))
                .forEach(name -> System.out.println(name));
        System.out.println();

        list.stream()
                .distinct()
                .filter(name -> name.startsWith("a"))
                .forEach(name -> System.out.println(name));
    }
}
