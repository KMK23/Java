package Chapter6.Question5;

public abstract class CoffeShop {
    int money;
    int customerCount;

    public void sellCoffe(int price){
        this.money += price;
        this.customerCount++;
    }

    public abstract void showInfo();
}
