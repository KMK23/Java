package chapter5.reference;

public class SubStudent {
    int studentID;
    String studentName;

//    int koreaScore;
//    int mathScore;
//    String koreaSubject;
//    String mathSubject;
//    위에것들은 subject로 들어가도 되잖아?

    Subject korea;
    Subject math;


    public SubStudent(){
        korea = new Subject("국어");
        math = new Subject("수학");

    }
    public SubStudent(int id, String name){
        studentID = id;
        studentName = name;
        korea = new Subject("국어");
        math = new Subject("수학");

    }

    public void setKorea( int score){
        korea.setScore(score);
    }

    public void setMath( int score){
        math.setScore(score);
    }

    public void showStudentInfo(){
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다." );
    }
}
