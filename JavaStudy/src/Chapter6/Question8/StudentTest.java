package Chapter6.Question8;

public class StudentTest {
    public static void main(String[] args) {
        Student Edward = new Student("Edward", 50000);

        Taxi taxi = new Taxi("회사이름" );

        Edward.takeTrans(taxi , 10000);
        taxi.showInfo();
        Edward.showInfo();
    }
}
