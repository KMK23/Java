package chapter8.inheritancePractice;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        saleRatio = 0.05;
        bonusRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }

}
