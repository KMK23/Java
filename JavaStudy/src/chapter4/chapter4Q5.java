package chapter4;

public class chapter4Q5 {
    public static void main(String[] args) {
        int totalLines = 4;
        for (int i = 1; i <= totalLines; i++) {
            // 공백 출력
            for (int j = 1; j <= totalLines - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        아랫부분
        for(int i = totalLines -1 ; i>=1; i--){
//        공백 출력
            for(int j =1; j <= totalLines-i; j++){
                System.out.print(" ");
            }
//        별 출력
            for(int j = 1; j <= 2*i -1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
