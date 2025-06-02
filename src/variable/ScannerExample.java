package variable;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String str1 = scanner.next();
        int int1 = Integer.parseInt(str1);

        System.out.print("y값 입력: ");
        String str2 = scanner.next();
        int int2 = Integer.parseInt(str2);

        int result = int1 + int2;
        System.out.println("x + y = " + result);
        System.out.println();

        while(true){
            System.out.print("입력 문자열 : ");
            String str3 = scanner.next();
            if(str3.equals("q")){
                break;
            }
            System.out.println("출력 문자열 : " + str3);
            System.out.println();
        }
    }
}
