package Chapter6.Question8;

public class Student {
    String name;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeTrans(Trans trans, int fare){
        if(money >= fare){
            money -= fare;
            trans.take(fare);
            System.out.println(name + "님이 " + fare + "를 내고 탔다 " );
        }else{
            System.out.println(name + "님, 잔액이 부족합니다.");
        }
    }
    public void showInfo(){
        System.out.println(name + "님의 남은 돈: " + money + "원");
    }
}
