package Chapter6.staticex;

public class Student2 {
    private static int serialNum = 1000;
    int studentId;
    String studentName;
    int grade;
    String address;

    public Student2(){
        serialNum++;
        studentId = serialNum;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
