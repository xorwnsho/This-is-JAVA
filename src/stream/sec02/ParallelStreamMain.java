package stream.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name ->{
            System.out.println(name + " : " + Thread.currentThread().getName());
        });
    }
}
