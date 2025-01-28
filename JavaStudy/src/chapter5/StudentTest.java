package chapter5;

public class StudentTest {
    public static void main(String[] args) {
    Student studentLee = new Student();
//      Student 라고 쓴건 참조형 데이터 타입 studentLee는 참조변수
        studentLee.studentName = "김경문";
        studentLee.studentID = 100;
        studentLee.address = "대전광역시 유성구";

        Student studentKim = new Student();
        studentKim.studentName = "김길제";
        studentKim.studentID = 101;
        studentKim.address = "대전광역시 서구";

        studentLee.showStudentInfor();
        studentKim.showStudentInfor();



        System.out.println(studentLee);
        System.out.println(studentKim);

//      chapter5.Student@9807454
//      chapter5.Student@3d494fbf
//      @다음 숫자는 16진수니까 각 4바이트니까
//      32비트 짜리 주소임.

    }
}
