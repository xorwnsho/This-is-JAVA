package operator;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 127;
        var1++;
        System.out.println(var1);

        byte var2 = -128;
        var2--;
        System.out.println(var2);
    }
}
