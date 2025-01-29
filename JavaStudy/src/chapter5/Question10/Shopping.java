package chapter5.Question10;

public class Shopping {
    int orderNum;
    String customerID;
    String buyDate;
    String customerName;
    String productNum;
    String addr;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Shopping(int orderNum, String customerID, String buyDate, String getCustomerName, String productNum, String addr){
        this.orderNum = orderNum;
        this.customerID = customerID;
        this. buyDate = buyDate;
        this.customerName = getCustomerName;
        this.productNum = productNum;
        this.addr = addr;

    }
}
