package chapter5.Question11;

public class Person {
    String name;
    float height;
    float weight;

    // 세 개의 매개변수를 받는 생성자
    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 두 개의 매개변수를 받는 생성자
    public Person(String name, float height) {
        this.name = name;
        this.height = height;
        this.weight = 0; // 기본값을 설정
    }

    // 두 개의 매개변수를 받는 생성자 (weight의 타입을 double로 변경)
    public Person(String name, double weight) {
        this.name = name;
        this.height = 0; // 기본값을 설정
        this.weight = (float) weight; // double을 float로 변환
    }
}
