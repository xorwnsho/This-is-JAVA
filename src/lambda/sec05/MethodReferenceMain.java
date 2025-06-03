package lambda.sec05;

public class MethodReferenceMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> Computer.staticMethod(x, y));
        person.action(Computer::staticMethod);

        Computer computer = new Computer();
        person.action(computer::instanceMethod);
    }
}
