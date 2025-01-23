package chapter4.loopExample;

public class doWhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do{
            sum += num;
            num++;
        }while (num < 11);

        System.out.println("더한 값은" + sum + "입니다.");
    }
}
