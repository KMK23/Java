package chapter4.loopExample;

public class continueExample {
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i =0; i <= 100; i++ ){
//            if(i % 2 !=0){
//                sum += i;
//            }
//        }
//            System.out.println(sum);

        int total = 0;
        int num;

        for(num =1; num <= 100; num++){
            if((num%2)==1){
                continue;
            }
            total += num;
        }
        System.out.println(total);
    }
}
