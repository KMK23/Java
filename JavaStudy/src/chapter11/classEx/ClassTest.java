package chapter11.classEx;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
// 총 3가지 방법으로 클래스명을 가지고 올수 있음
// 근데 1번 2번은 Person 이라는 클래스가 컴파일 되서 있어야 쓸수있음.
        Person person = new Person();
//
        Class pClass1 = person.getClass();
//      getClass메서드는 object 꺼임 object의 상속을 받은거
//      class class를 반환
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());
//      위에것들을 스태틱로딩이라고 한다.


        Class pClass3 = Class.forName("java.lang.String");
        System.out.println(pClass3.getName());
//      클래스가 있으면 그냥 가져온다.
//      동적 로딩이라고 함. 있는놈이면 살것이고 없으면 런 할때 죽을것이다.


        Person p = new Person();

        Class pClass4 = Class.forName("chapter11.classEx.Person");

        Person p2 =(Person) pClass4.newInstance();
        System.out.println(p);
        System.out.println(p2);
    }
}
