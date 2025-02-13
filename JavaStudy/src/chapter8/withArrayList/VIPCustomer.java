package chapter8.withArrayList;

public class VIPCustomer extends Customer {
    int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

//        System.out.println("VIPCustomer(int, String) 호출");
        
    }

    public int getAgentID(){
        return agentID;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
    }
}
