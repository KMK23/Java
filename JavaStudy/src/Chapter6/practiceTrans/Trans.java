package Chapter6.practiceTrans;

public abstract class Trans {
    int passengerCount;
    int money;

    // 대중교통을 탈 때 호출할 메서드 (자식 클래스에서 구현)
    public void take(int fare) {
        this.money += fare;
        this.passengerCount++;
    }

    // 대중교통 정보 출력 (자식 클래스에서 오버라이딩)
    public abstract void showInfo();
}