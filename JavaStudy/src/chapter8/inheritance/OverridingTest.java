package chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "Lee");
     int price =  customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "원이고" + customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(100011, "Kim", 100);
         price = customerKim.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "원이고" + customerKim.showCustomerInfo());

        Customer customerWho = new VIPCustomer(100012, "who", 100);
        price = customerWho.calcPrice(10000);
//      이게 가상함수이다. 왜 불리는게 VIPCustomer가 불리냐?
//      재정의 된 메서드 호출 ==> VIPCustomer 에다가 calcPrice 했으니까 그게 불린거야
        System.out.println("지불 금액은 " + price + "원이고" + customerWho.showCustomerInfo());
    }
}
