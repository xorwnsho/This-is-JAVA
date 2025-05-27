package chap6;

public class Car {
    private int speed;
    private boolean stop = false;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0){
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    // 불리언 값을 리턴하는 Getter는 관례적으로 is를 붙임
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true){
            this.speed = 0;
        }
    }
}
