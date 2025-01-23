package chapter4;

public class chapter4Q14 {
    public static void main(String[] args) {
        for(int i = 3; i<= 9; i++){
            for(int j = 1; j<=9; j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println();
        }

        for(int num = 1; num <= 100; num++ ){
            if(num % 3 != 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
