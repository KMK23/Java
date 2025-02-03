package Chapter6.Question8;

public class Taxi extends Trans{
    String companyName;

    public Taxi(String companyName){
        this.companyName =  companyName;
    }
    @Override
    public void showInfo(){
        System.out.println(companyName + " 택시 수입은 " + money + "입니다.");
    }


}
