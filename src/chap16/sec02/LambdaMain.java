package chap16.sec02;

public class LambdaMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()->{
            System.out.println("Hello");
            System.out.println("World");
        });

        person.action(()-> System.out.println("Hello World"));
    }
}
