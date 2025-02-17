package chapter10.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();
        buyer.order();
        seller.order();

//customer.order(); → Customer의 order() 실행 → "고객판매 주문" 출력
//buyer.order(); → buyer는 Buy 타입이지만, Customer의 order() 실행 → "고객판매 주문" 출력
//seller.order(); → seller는 Sell 타입이지만, Customer의 order() 실행 → "고객판매 주문" 출력
//즉, Customer가 order()를 오버라이딩했기 때문에, order()를 호출할 때는 항상 Customer의 order()가 실행됨.
//(인터페이스의 order() 메서드는 더 이상 사용되지 않음!)


//  즉!
//  buyer.order();, seller.order();는 인터페이스 타입이지만 실제 객체가 Customer이므로 Customer의 order()가 실행됨.
    }
}
