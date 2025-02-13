//package hello;
//
//public class Employee {
//    public String name;
//    public String grade;
//
//    public Employee(String name) {  // 매개변수를 받는 생성자만 존재
//        this.name = name;
//    }
//}
//
//public class Engineer extends Employee {
//    private String skillset;
//
//    // 부모 클래스(Employee)의 생성자를 명확하게 호출해야 함!
//    public Engineer(String name) {
//        super(name);  // 부모 클래스(Employee)의 생성자 호출
//    }
//
//    public String getSkillset() {
//        return skillset;
//    }
//
//    public void setSkillset(String skillset) {
//        this.skillset = skillset;
//    }
//}
