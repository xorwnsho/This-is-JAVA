package chap4;

import java.util.Scanner;

public class Wang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 90){
            System.out.println("A");
        } else if(n >= 80){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
