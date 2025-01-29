package chapter5.Question11;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신", 190, 80);

        String info;
        info = String.format("이름 : %s \n키 : %f \n몸무게 : %f\n", personLee.name, personLee.height, personLee.weight);
        System.out.println(info);
    }
}


