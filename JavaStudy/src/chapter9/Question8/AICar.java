package chapter9.Question8;

public class AICar extends Car{
    @Override
    public void showInfo() {
        System.out.println("====자율 주행하는 자동차=====");
    }
    @Override
    public void drive() {
        System.out.println("자율 주행");
        System.out.println("알아서 방향 전환");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절");
    }
}
