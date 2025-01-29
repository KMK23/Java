package chapter5.test;

import chapter5.Question12.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setAddress("서울 양천구");
        studentLee.setStudentName("이상원");
        System.out.println(studentLee.getStudentName());
        System.out.println(studentLee.getAddress());
    }
}
