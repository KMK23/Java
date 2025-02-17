package chapter9.Question8;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 킵니다");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    public abstract void showInfo();

    final public void run(){
        showInfo();
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }

}
