package chapter9.tamplate;

public class AICar extends Car{
    @Override
    public void dirve() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 전환합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 자동으로 조절됩니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동으로 세차가 됩니다.");
    }
}
