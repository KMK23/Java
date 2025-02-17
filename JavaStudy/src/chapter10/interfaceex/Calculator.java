package chapter10.interfaceex;

public abstract class Calculator implements Calc{
//    일부만 구현하게 되면 다 구현하지 않았으니
//    추상 메서드를 갖게 되는것이고 그래서 abstract를 써야함

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

//    implements
//    대상 : 클래스 -> 인터페이스
//    구현 여부 : 모든 추상 메서드 구현
//    특징 : 일부만 구현하면 추상 클래스가 된다.
}
