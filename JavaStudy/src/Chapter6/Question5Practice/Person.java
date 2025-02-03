package Chapter6.Question5Practice;

public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeTransprot(Transport transport, int fare){
        if(money >= fare){
            money -= fare;
            transport.take(fare);
            System.out.println(name + "님이 " + fare + "원을 내고 대중교통을 이용했습니다.");
        }
        else{
            System.out.println(name + "님, 잔액이 부족합니다.");
        }
    }

    public void showInfo(){
        System.out.println(name + "님의 남은 돈: " + money + "원");
    }

}
