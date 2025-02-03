package Chapter6.Question5;

public class Customer {
    int money;
    String name;

    public Customer(int money, String name){
        this.money = money;
        this.name = name;
    }

    public void buyCoffee(CoffeShop shop, int price){
        if(money >= price){
            money -= price;
            shop.sellCoffe(price);
            System.out.println(name + "님이 " + price + "원으로 커피를 구매했습니다.");
        }
        else{
            System.out.println(name + "님, 잔액이 부족합니다." );
        }
    }
    public void showInfo(){
        System.out.println(name + "님의 남은 돈 : " + money + "원");
    }
}
