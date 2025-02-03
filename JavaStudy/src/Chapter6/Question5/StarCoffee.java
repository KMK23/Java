package Chapter6.Question5;

public class StarCoffee extends CoffeShop{
    @Override
    public void showInfo(){
        System.out.println("☕ 별다방 - 총 매출: " + money + "원, 방문 고객 수: " + customerCount + "명");
    }
}
