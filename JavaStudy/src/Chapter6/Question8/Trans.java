package Chapter6.Question8;

public abstract class Trans {
    int money;
    int passengerCount;

    public void take(int fare){
        this.money =+ fare;
        this.passengerCount++;
    }

    public abstract void showInfo();
}
