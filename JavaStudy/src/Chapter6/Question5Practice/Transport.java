package Chapter6.Question5Practice;

public abstract class Transport {
    int customerCount;
    int money;

    public void take(int fare){
      this.customerCount++;
      this.money += fare;
    }

    public abstract void showInfo();
}
