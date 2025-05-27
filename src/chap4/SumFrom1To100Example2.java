package chap4;

public class SumFrom1To100Example2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1 ~ " + (i-1) + " = " + sum);

    }
}
