package chapter13.innerclass;

import java.util.ArrayList;

class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;


    public OutClass(){
        inClass = new InClass();
    }

    private class InClass {

        int inNum = 200;
//        static int sInNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

//        static void sTest(){
//        이것도 사용 못함 왜냐면 인스턴스 내부 클래스인데 생성과 상관없이 호출되어야하는데 안되니까
//        }
    }
//  이렇게 static 뭐 이런거 안써있는걸 인스턴스 이너클래스라고 함


    public void usingInTest(){
        inClass.inTest();
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
//            num += 10;
//            이렇게는 쓸수없어 왜나면 num 이 OutClass 꺼니까
            sNum += 10;
//            이건 가능 왜냐면 정적변수니까
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest(){
            System.out.println(sNum);
//            System.out.println(iNum);
            System.out.println(sInNum);
//        이러면 모든 정적변수들만 쓸수있따.
        }
    }
}


public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
//        outClass.inClass.inTest();

//        OutClass.InClass inClass = outClass.new InClass();
//        이렇게도 쓸수 있다(이건 위에 InClass 를 private로 했을때)

        outClass.usingInTest();
//        이런방식으로 제일 많이 쓴다.

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();
    }
}
