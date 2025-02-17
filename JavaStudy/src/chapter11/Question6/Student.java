package chapter11.Question6;

public class Student {
    private String studentName;
    private int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String toString(){
        return studentName + " " + studentID;
    }

    public static void main(String[] args) {
        Student studentLee = new Student("이순신", 10001);
        System.out.println(studentLee);
    }
}
