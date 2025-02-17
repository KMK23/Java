package chapter9.Question7;

public abstract class Car {

//    public abstract void run();
//    public abstract void refuel();
//    public abstract void stop();
//
//    public void takePassenger(){
//        System.out.println("승객을 버스에 태웁니다.");
//    }
//
//    public void load(){
//        System.out.println("짐을 싣습니다.");
//    }


    public abstract void run();
    public abstract void refuel();
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }

}
