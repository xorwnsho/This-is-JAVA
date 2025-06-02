package anonymous.sec7;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();

        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}
