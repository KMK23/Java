package chapter10.interfaceex;

public class Customer implements Buy,Sell{
    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
        System.out.println("구매하기");

    }

    @Override
    public void order() {
        System.out.println("고객판매 주문");
}


}
