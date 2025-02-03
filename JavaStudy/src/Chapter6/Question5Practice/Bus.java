package Chapter6.Question5Practice;

public class Bus extends Transport{
    int busNumber;

    public Bus(int busNumber){
        this.busNumber = busNumber;

    }
    @Override
    public void showInfo(){
        System.out.println("🚌 버스 " + busNumber + "번 - 승객 수: " + customerCount + "명, 수입: " + money + "원");
    }


}
