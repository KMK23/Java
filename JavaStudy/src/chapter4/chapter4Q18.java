package chapter4;

import java.util.Scanner;

public class chapter4Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. 사용자로부터 숫자 입력받기
        System.out.println("팩토리얼 계산할 숫자를 입력하세요:");
        int n = scanner.nextInt(); //정수만 입력받기

//        2. 팩토리얼 계산
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
/*
            이렇게 하는게 처음 i가 1이면
            factorial = 1 * 1 = 1(여기 1값이 factorial에 들어간거지)
            i가 2 이면
            factorial = 1(여기 1이 위에 factoral) * 2 = 2
            i가 3 이면
            factorial = 2*3 = 6
            i가 4 이면
            factorial = 6*4 = 24
            i가 5이면
            factorial = 24 * 5 = 120
            따라서 5라고 했으니까 120이 나온거야
 */
        }
        System.out.println(n+ "팩토리얼은" + factorial + " 입니다");
    }
}
