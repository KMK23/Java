package chapter7.Question8;

public class StudentArray {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Lee");
        students[1] = new Student("Park");
        students[2] = new Student("Kim");

        for (int i = 0; i < students.length ; i++){
            System.out.println(students[i].showStudentInfo());
        }

    }
}
