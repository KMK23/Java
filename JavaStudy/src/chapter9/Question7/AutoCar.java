package chapter9.Question7;

public class AutoCar extends Car{
//    @Override
//    public void run() {
//        System.out.println("자동차가 달립니다.");
//    }
//
//    @Override
//    public void refuel() {
//        System.out.println("천연가스 충전.");
//
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("자동차가 멈춥니다.");
//
//    }

    @Override
    public void run() {
        System.out.println("자동차가 달립니다.");
    }

    @Override
    public void refuel() {
        System.out.println("휘발유를 주유합니다.");
    }

    public void load() {
        System.out.println("짐을 싣습니다.");
    }

}
