package lambda.sec06;

public class MethodReferenceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareTo);
    }
}
