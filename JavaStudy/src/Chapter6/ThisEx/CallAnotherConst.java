package Chapter6.ThisEx;

class Person{
    String name;
    int age;

    public Person(){
        this("이름 없음", 1);
//        여기서 this 는 밑에 만들어놓은 생성자
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public  Person returnSelf(){
        return this;
    }
}



public class CallAnotherConst {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
    }
}
