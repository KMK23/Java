package chapter10.interfaceex;

public interface Calc {

    double PI = 3.14;
    int Error = -99999999;
//  interface 일때 아무것도 쓰지 않아도 public static final 이 숨겨져있음 ==> 상수와 추상메서드가 생성

    //   더하기
    int add(int num1, int num2);

    //    빼기
    int substract(int num1, int num2);

    //    곱하기
    int times(int num1, int num2);

    //    나누기
    int divide(int num1, int num2);


    default void description (){
        System.out.println("정수 계산기를 구현합니다.");
    }

    static int total(int[] arr){
        int total = 0;
        for(int i: arr){
            total += i;
        }
        return total;
    }
}
