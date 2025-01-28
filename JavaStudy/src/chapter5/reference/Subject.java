package chapter5.reference;

public class Subject {
    String subjectName;
    int Score;

    public Subject(String name){
        subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

//    get, set 은 alt + insert
}
