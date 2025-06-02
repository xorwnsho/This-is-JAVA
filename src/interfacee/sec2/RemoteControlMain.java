package interfacee.sec2;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();
        remoteControl.turnOn();

        Audio audio = new Audio();
        audio.turnOn();
    }
}
