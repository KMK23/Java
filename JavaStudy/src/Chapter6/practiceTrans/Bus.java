package Chapter6.practiceTrans;

public class Bus extends Trans {
    int busNumber;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    @Override
//  이건 부모 클래스에서 abstract 를 써서 자식 클래스에서 정의할께!!
//  라고 했기 때문에 반드시 써야하는것.
    public void showInfo() {
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}