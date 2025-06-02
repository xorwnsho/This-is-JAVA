package base.sec05;

import java.util.StringTokenizer;

public class StringTokenizerMain {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("[&,]");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println();
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
