package chapter4;

public class chapter4Q8 {
    public static void main(String[] args) {
        int score = 99;


        if (score <= 100 && score >= 90) { // 90 ~ 100
            System.out.println("Grade: A");
        } else if (score < 90 && score >= 80) { // 80 ~ 89
            System.out.println("Grade: B");
        } else if (score < 80 && score >= 70) { // 70 ~ 79
            System.out.println("Grade: C");
        } else if (score < 70 && score >= 60) { // 60 ~ 69
            System.out.println("Grade: D");
        } else { // 그 외
            System.out.println("Grade: F");
        }
    }
}
