package operator;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x: " + x);

        y--;
        --y;
        System.out.println("y: " + y);

        z= x++;
        System.out.println("z: " + z);
        System.out.println("x: " + x);

        z = ++x + y++;
        System.out.println("z: " + z);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
