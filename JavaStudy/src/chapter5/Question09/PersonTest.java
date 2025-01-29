package chapter5.Question09;

public class PersonTest {
    public static void main(String[] args) {
    Person person = new Person(40, "James", true, "셋");

        System.out.println("나이가 " + person.getAge() + "살, 이름이 " + person.getName() + "인 남자가 있습니다.");

        if(person.isMarried()){
            System.out.println("이 남자는 결혼을 했고, 자식이 " + person.getChild()+" 있습니다");
        }else{
            System.out.println("이 남자는 결혼을 하지 않았습니다.");
        }
    }


}
