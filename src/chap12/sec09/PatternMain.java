package chap12.sec09;

import java.util.regex.Pattern;

public class PatternMain {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-3458-9317";

        boolean result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치합니다.");
        } else{
            System.out.println("정규식과 일치하지 않습니다.");
        }

        regExp = "\\w+@\\w+\\.\\W+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치합니다");
        } else{
            System.out.println("정규식과 일치하지 않습니다");
        }
    }
}
