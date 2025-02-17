package chapter9.Question8;

public class CarTest {
    public static void main(String[] args) {
        Car yourCar = new AICar();
        yourCar.run();

        System.out.println("=============");
        Car myCar = new ManualCar();
        myCar.run();
    }
}
