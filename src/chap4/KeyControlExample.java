package chap4;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run) {
            System.out.println("--------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("--------------");
            System.out.print("선택: ");
            String num =  scanner.nextLine();
            if( num.equals("1")) {
                speed++;
                System.out.println("현재 속도 : " + speed);
            } else if( num.equals("2")) {
                speed--;
                System.out.println("현재 속도 : " + speed);
            } else {
                run = false;
                System.out.println("프로그램 종료");
            }
        }

    }
}
