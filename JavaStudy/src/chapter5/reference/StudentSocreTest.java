package chapter5.reference;

public class StudentSocreTest {
    public static void main(String[] args) {
        SubStudent studentJames = new SubStudent(100, "James");
        studentJames.setKorea( 100);
        studentJames.setMath( 100);

        SubStudent studentThomas = new SubStudent(101, "Thomas");
        studentThomas.setKorea( 80);
        studentThomas.setMath( 60);

        studentJames.showStudentInfo();
        studentThomas.showStudentInfo();
    }
}
