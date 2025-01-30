package Chapter6.practiceTrans;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTrans(Trans trans, int fare){
        trans.take(fare);
        this.money -= fare;
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
    }

}


