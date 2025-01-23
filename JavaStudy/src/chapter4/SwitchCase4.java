package chapter4;

public class SwitchCase4 {
    public static void main(String[] args) {
        String medal = "Gold";
        
        switch (medal){
            case "Gold" -> System.out.println("금");
            case "Silver" -> System.out.println("은");
            case "Bronze" -> System.out.println("동");
            default -> System.out.println("노메달");
        }
    }
}
