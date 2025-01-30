class Student {
    private int id;
    private String name;
    private int grade;

    public int getId() {
        return id;
    }

    // 반환 타입을 void에서 Student로 변경하여 this 반환 가능
    public Student setId(int id) {
        this.id = id;
        return this; // 메소드 체이닝을 위해 this를 반환
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this; // 메소드 체이닝을 위해 this를 반환
    }

    public int getGrade() {
        return grade;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this; // 메소드 체이닝을 위해 this를 반환
    }

    public void showStudentInfo() {
        String info = String.format("%s 님의 학번은 %d이고, %d학년 입니다.", name, id, grade);
        System.out.println(info);
    }
}

public class ReturnItSelf {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setId(12345).setName("이원상").setGrade(3); // 체이닝 가능
        studentLee.showStudentInfo();  // 별도로 호출하여 정보 출력
    }
}
