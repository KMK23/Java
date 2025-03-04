package chapter13.stream;
//중복 요소를 제거하는 distinct 연산

import java.util.ArrayList;
import java.util.List;

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true; // 같은 객체면 true
        if (obj == null || getClass() != obj.getClass()) return false; // null이거나 클래스 다르면 false

        Student student = (Student) obj; // Object에서 Student로 형변환
        return id == student.id; // id가 같으면 같은 객체로 판단
    }

}



public class DistinctTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이윤선");
        Student studentMoon = new Student(101, "문찬옥");
        Student studentLee2 = new Student(100, "이윤선");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentLee);
        studentList.add(studentMoon);
        studentList.add(studentLee2);

//        studentList.stream().map(Student::getName).distinct().forEach(s -> System.out.println(s));
        studentList.stream().distinct().forEach(s -> System.out.println(s.getName()));

}}
