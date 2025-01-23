package chapter4;

public class SwitchCase3 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch(medal){
            case "Gold" :
                System.out.println("금메달");
                break;
            case "Silver" :
                System.out.println("은메달");
                break;
            case "Bronze" :
                System.out.println("동메달");
                break;
            default:
                System.out.println("노메달");
        }
    }
}

// 이렇게 케이스 문 앞에다가 문자열 가능