package Chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(Student.serialNum);
        System.out.println(studentLee.studentName+ " 학번: " + studentLee.studentId);

        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(Student.serialNum);
        System.out.println(studentSon.studentName + " 학번: " + studentSon.studentId);

    }
}
