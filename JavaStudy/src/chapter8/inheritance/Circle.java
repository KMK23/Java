package chapter8.inheritance;

public class Circle {

    Point point; //has - a 관계

//  일반적으로 참조 변수 갖다 쓰는것.
//  지금 점과 원은 일반적으로 쓰는것이지 상속의 개념이 아니다.
//  상속은 구체적인 기능을 만들때 쓴다.(ex 먹는거, 타는거 등등)

      private int radius;

    public Circle(){
        point = new Point();
    }

}
