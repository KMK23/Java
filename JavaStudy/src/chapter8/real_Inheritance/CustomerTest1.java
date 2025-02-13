package chapter8.real_Inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10010);
//        customerLee.setCustomerName("이순신");

        Customer customerKim = new VIPCustomer(10101,"김길제",100);

        customerKim.bonusPoint = 1000;
//        customerKim.agentID = 이게 없음
//        근데 VIPCustomer라고 하면 VIPCustomer.agentID 가 있음


//        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

    }
}
