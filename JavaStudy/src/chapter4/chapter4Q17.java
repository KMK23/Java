package chapter4;

import java.util.Scanner;

public class chapter4Q17 {
    public static void main(String[] args) {
        // 1. 사용자 입력 받기
        Scanner scanner = new Scanner(System.in); // 스캐너 생성
        System.out.print("숫자를 입력하세요: ");   // 입력 안내문 출력
        int n = scanner.nextInt();               // 숫자 입력 받기

        // 2. 결과 출력 시작
        System.out.println("1부터 " + n + " 사이의 소수는:");

        // 3. 1부터 n까지 소수 찾기
        for (int i = 2; i <= n; i++) {           // 숫자 2부터 n까지 반복
            if (isPrime(i)) {                    // i가 소수라면
                System.out.print(i + " ");       // i를 출력
            }
        }
    }

    // 4. 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) { // 1은 소수가 아님
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // 2부터 num의 제곱근까지 확인
            if (num % i == 0) { // 나누어떨어지면 소수가 아님
                return false;
            }
        }
        return true; // 소수임
    }
}

/*예:
Math.sqrt는 숫자의 제곱근을 계산하는 함수
Math.pow (제곱),
Math.abs (절대값),
Math.max (최댓값),
Math.min (최솟값) 등.*/
