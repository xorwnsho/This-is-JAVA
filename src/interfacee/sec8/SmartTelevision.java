package interfacee.sec8;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색");
    }
}
