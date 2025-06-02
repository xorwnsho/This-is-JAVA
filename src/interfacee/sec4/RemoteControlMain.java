package interfacee.sec4;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl1 = new Television();
        RemoteControl remoteControl2 = new Audio();

        remoteControl1.turnOn();
        remoteControl1.setVolume(5);
        remoteControl1.turnOff();

        remoteControl2.turnOn();
        remoteControl2.setVolume(15);
        remoteControl2.turnOff();
    }
}
