package chap11.sec05;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        findClass();
    }
    public static void findClass() throws Exception{
        Class.forName("java.lang.String2");
    }
}
