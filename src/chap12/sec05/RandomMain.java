package chap12.sec05;

import java.util.Arrays;
import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        int[] selectNumber = new int[6];
        Random random = new Random(2);
        System.out.println("선택 번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winnigNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨 번호: ");
        for (int i = 0; i < 6; i++) {
            winnigNumber[i] = random.nextInt(45) + 1;
            System.out.print(winnigNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winnigNumber);
        boolean result = Arrays.equals(selectNumber, winnigNumber);
        if(result){
            System.out.println("1등 당첨");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }

    }
}
