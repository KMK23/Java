package chapter9.tamplate;

public abstract class Car {

    public abstract void dirve();
    public abstract void stop();

    public abstract void wiper();
    public void washCar(){}
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public final void run(){
        startCar();
        dirve();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
