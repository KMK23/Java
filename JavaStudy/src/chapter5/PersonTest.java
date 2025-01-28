package chapter5;

public class PersonTest {
    public static void main(String[] args) {
        Person personPark = new Person("박지성");
        personPark.height = 178.0F;
        personPark.weight = 72.0F;

        Person personKim = new Person();
        personKim.name = "김길제";
        personKim.height = 172.5F;
        personKim.weight = 68.5F;

        Person personLee = new Person("이순신", 175, 75);


        System.out.println("personPark 정보: " + personPark.name + ", " + personPark.height + ", " + personPark.weight);
        System.out.println("personKim 정보: " + personKim.name + ", " + personKim.height + ", " + personKim.weight);
        System.out.println("personLee 정보: " + personLee.name + ", " + personLee.height + ", " + personLee.weight);
    }
    }

