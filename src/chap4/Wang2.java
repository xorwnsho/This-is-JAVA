package chap4;

import java.util.Scanner;

public class Wang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 90) {
            if (n >= 95) {
                System.out.println("A+");
            } else {
                System.out.println("A0");
            }
        } else if (n >= 85) {
            System.out.println("B+");
        } else {
            System.out.println("B0");
        }
    }
}
