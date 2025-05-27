package chap3;

public class BitShiftExample {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);
        // 여기서 Math.pow(2, 3)은 2^3을 수행하고 double 값을 산출.
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
    }
}
