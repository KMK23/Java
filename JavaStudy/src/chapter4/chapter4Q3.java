package chapter4;

public class chapter4Q3 {
    public static void main(String[] args) {
        for(int i = 2; i<10; i++){
            for(int j =1; j < 10; j++){
            if(j>i){
                break;
            }
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
