package chapter7.Question11;

public class Student {
 private int studentID;
 private String studentName;
 private static int nextID = 1000;

 public Student(String studentName){
     nextID++;
     this.studentID = nextID;
     this.studentName = studentName;
 }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String showStudentInfo(){
     return studentID + ", " + studentName;
    }

}
