package chapter11.object;

class Student{
    int studentID;
    String studentName;

    Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Student){
            Student std = (Student) obj;
            if(studentID == std.studentID){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public int hashCode(){
        return studentID;
    }

}


public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Student studentLee = new Student(10001, "Lee");
        Student studentKim = new Student(10001, "Kim");

        System.out.println(studentLee == studentKim);
        System.out.println(studentLee.equals(studentKim));

        System.out.println(studentLee.hashCode());
        System.out.println(studentKim.hashCode());

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
