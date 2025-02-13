package chapter8.real_Inheritance;

public class VIPCustomer extends Customer{
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
        return price;
    }

}
