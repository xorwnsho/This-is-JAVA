package thread.sec07;

public class SafeStopMain {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){}
        thread.interrupt();
    }
}
