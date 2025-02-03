package Chapter6.Question5Practice;

public class PersonTest {
    public static void main(String[] args) {
        Person chulsoo = new Person("철수", 5000);
        Person younghee = new Person("영희", 10000);

        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway(2);

        chulsoo.takeTransprot(bus100, 1200);
        bus100.showInfo();
        chulsoo.showInfo();

        younghee.takeTransprot(subway2, 1500);
        subway2.showInfo();
        younghee.showInfo();
    }



}
