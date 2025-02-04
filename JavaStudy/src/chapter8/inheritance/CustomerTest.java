package chapter8.inheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10100);
//        customerLee.setCustomerName("Lee");

        Customer customerKim = new VIPCustomer(10101,"kim", 100);
//        customerKim.agentID 이건 안보임. 왜냐면 customer꺼니까 private 풀어도 안보임


        customerKim.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());


//        하위 클래스가 생성 되면 상위 클래스부터 생성된다.
        System.out.println(customerKim.showCustomerInfo());
    }
}
