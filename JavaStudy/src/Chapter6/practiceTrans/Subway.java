package Chapter6.practiceTrans;

public class Subway extends Trans {
    int lineNumber;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void showInfo() {
        System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
