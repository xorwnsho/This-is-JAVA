package stream.sec08;

import java.util.Arrays;

public class LoopingMain {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));

        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n-> System.out.println(n))
                .sum();
        System.out.println("total = " + total);
        System.out.println();

        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
