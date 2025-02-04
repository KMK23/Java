package chapter8.inheritance;

public class Customer {
//    외부 클래스는 private 지만 상속 관계에서만 public 으로 보이는 키워드가
//    protected 이다. 패키지가 달라도 상속관계에서는 public


//    제일 가시성이 작은거는 private 그다음 default, 그다음 protected 그다음 public
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;


//    public Customer(){
//
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//
//        System.out.println("Customer() 호출");
//    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 호출");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
