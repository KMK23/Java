package chapter9.abstractex;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

//    public abstract int add(int x, int y);

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다");
    }

}
