package chapter9.tamplate;

public class ManualCar extends Car{
    @Override
    public void dirve() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");

    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 잡습니다..");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 조절됩니다.");
    }
}
