package chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){

        super(customerID, customerName);
//      생성자가 호출된다. 매개변수가 하나도 없으니까 default constructor 를 소환
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;

        System.out.println("VIPCustomer(int, String) 호출");

    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }

    public int getAgentID(){
        return agentID;
    }
}
