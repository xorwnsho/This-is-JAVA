package chap6;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int sum1 = computer.sum(1, 2, 3);
        int sum2 = computer.sum(1, 2, 3, 4, 5);

        int[] values = { 1, 2, 3, 4, 5 };
        int sum3 =  computer.sum(values);

        int sum4 = computer.sum(new int[] { 2, 3, 4, 5, 6});
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
