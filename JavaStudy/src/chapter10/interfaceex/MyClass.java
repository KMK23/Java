package chapter10.interfaceex;

public class MyClass implements Myinterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("Y()");
    }

    @Override
    public void y() {
        System.out.println("X()");

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        X x = myClass;
        x.x();
    }
}
