package chapter9.Question5;

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();


    public void carWash(){
        System.out.println("세차를 합니다.");
    }

final public void run(){

    start();
    drive();
    stop();
    turnOff();
    carWash();
    }
}
