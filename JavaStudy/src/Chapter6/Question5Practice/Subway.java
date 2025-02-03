package Chapter6.Question5Practice;

public class Subway extends Transport{
    int subwayLine;
    
    public Subway(int subwayLine){
        this.subwayLine = subwayLine;
    }
    @Override
    
    public void showInfo(){
        System.out.println("🚇 지하철 " + subwayLine + "호선 - 승객 수: " + customerCount + "명, 수입: " + money + "원");
    }
}
