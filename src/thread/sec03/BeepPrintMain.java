package thread.sec03;

import java.awt.*;

public class BeepPrintMain {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try{ Thread.sleep(1000); } catch(Exception e){}
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{ Thread.sleep(500); } catch(Exception e){}
        }
    }
}
