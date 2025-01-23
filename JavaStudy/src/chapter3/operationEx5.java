package chapter3;

public class operationEx5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = num1 | num2;


        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));

        int num3 = 5; //00000101
//        System.out.println(num3 << 1);
//        이렇게 해서 num3가 바뀌냐? 아니야
//        그래서 복합대입연산자를 써야해 비트연산자랑 같이써야해
//        따라서
        System.out.println(num3 << 1);
//        이렇게 써야지 num3 의 값이 바뀌는거야
        System.out.println(num3);
        System.out.println(num3 >> 1);
    }
}
