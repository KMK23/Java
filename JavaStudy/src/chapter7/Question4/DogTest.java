package chapter7.Question4;

public class DogTest {
    public static void main(String[] args) {
    Dog[] dogArray = new Dog[5];

    dogArray[0] = new Dog("멍멍이1", "똥개");
    dogArray[1] = new Dog("왈왈이2", "시고르브잡종");
    dogArray[2] = new Dog("컹컹이3", "똥개2");
    dogArray[3] = new Dog("으르렁4", "시고르브잡종2");
    dogArray[4] = new Dog("멍멍이5", "똥개3");

    for(int i = 0; i< dogArray.length ; i++){
        System.out.println(dogArray[i].showDogInfo());
    }
        System.out.println("=============");
    for(Dog dog : dogArray){
        System.out.println(dog.showDogInfo());
    }
    }




}
