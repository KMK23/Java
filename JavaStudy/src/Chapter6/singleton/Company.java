package Chapter6.singleton;

public class Company {

   private static Company instance = new Company();

  private Company(){}

    public static Company getInstance(){
//      객체를 생성하지 않고 메서드를 사용할수 있는 방법 = static
        if(instance == null){
            instance = new Company();
        }
      return instance;
    }
}
