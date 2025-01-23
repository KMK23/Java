package chapter3;

public class operationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10)<10) && ((i = i+2)<10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
//  여기서 i 가 4가 아니라 2 가 나오는데 그 이유가 이미 처음 num1=num1+10 이 20값인데 10보다 작지 않으니까
//  뒤에서 식은 아예 실행이 안된다.

        value = ((num1 = num1 + 10)>10) || ((i = i+2)<10);

        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
//  여기서도 i는 2가 되는데 논리 합에서 앞 항의 결과값이 참이므로 이 문장은 실행되지 않아
    }
}
