package chapter3;
//산술 연산자를 사용하여 총점과 평균 구하기
public class operationEx11 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 80;

//    int totalScore = mathScore + engScore;
//        System.out.println(totalScore);
//
//        double avgScore = totalScore / 2.0;
//        System.out.println(avgScore);
        int totalScore = mathScore + engScore + korScore;
        System.out.println(totalScore);

        double avrScore = totalScore / 3.0;
        System.out.println(avrScore);


    }
}
