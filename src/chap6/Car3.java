package chap6;

public class Car3 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car3(){}

    public Car3(String model) {
        this.model = model;
    }

    public Car3(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car3(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
