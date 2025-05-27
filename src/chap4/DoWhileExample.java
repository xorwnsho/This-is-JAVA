package chap4;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("> ");
            input = scanner.next();
            System.out.println(input);
        } while(!input.equals("q"));
        System.out.println("프로그램 종료");
    }
}
