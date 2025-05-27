package chap4;

public class Wang3 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum += i;
        }
        System.out.println(sum);

        int n2 =10;
        int sum2 = 0;
        for(int i = 1; i <= n2; i++){
            if(i %2==0){
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }
}
