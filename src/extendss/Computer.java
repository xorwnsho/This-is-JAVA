package extendss;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double radius) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * radius * radius;
    }
}
