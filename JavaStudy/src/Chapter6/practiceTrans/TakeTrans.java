package Chapter6.practiceTrans;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("james", 5000);
        Student tomas = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreenn = new Subway(2);

        james.takeTrans(bus100,1000);
        bus100.showInfo();
        james.showInfo();
        tomas.takeTrans(subwayGreenn, 1500);
        subwayGreenn.showInfo();
        tomas.showInfo();
    }

}
