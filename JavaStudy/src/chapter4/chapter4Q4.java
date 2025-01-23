package chapter4;

public class chapter4Q4 {
    public static void main(String[] args) {
        int totalLines = 4; // 총 줄 수
        for (int i = 1; i <= totalLines; i++) { // 1부터 시작 (줄 번호)
            // 공백 출력
            for (int j = 1; j <= totalLines - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
    }
    }
    }

