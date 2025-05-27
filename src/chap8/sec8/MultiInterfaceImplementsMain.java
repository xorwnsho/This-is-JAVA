package chap8.sec8;

public class MultiInterfaceImplementsMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        Searchable searchable = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        searchable.search("www.google.com");
    }
}
