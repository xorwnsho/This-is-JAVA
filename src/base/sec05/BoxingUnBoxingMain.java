package base.sec05;

public class BoxingUnBoxingMain {
    public static void main(String[] args) {
        Integer obj = 10000;
        System.out.println("value = " + obj.intValue());

        int value = obj;
        System.out.println("value = " + value);

        int result = obj + 100;
        System.out.println("result = " + result);
    }
}
