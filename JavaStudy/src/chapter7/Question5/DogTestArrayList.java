package chapter7.Question5;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
    ArrayList<Dog> list = new ArrayList<Dog>();

    list.add(new Dog("멍1", "똥개1"));
    list.add(new Dog("멍2", "똥개2"));
    list.add(new Dog("멍3", "똥개3"));
    list.add(new Dog("멍4", "똥개4"));
    list.add(new Dog("멍5", "똥개5"));

    for(int i = 0 ; i < list.size(); i++){
        System.out.println(list.get(i).showDogInfo());
    }

    for(Dog dog : list){
        System.out.println(dog.showDogInfo());
    }
    }

}
