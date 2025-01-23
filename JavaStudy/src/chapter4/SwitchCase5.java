package chapter4;

public class SwitchCase5 {
    public static void main(String[] args) {
        String medal = "Silver";
        String message = switch (medal){
            case "Gold" -> "금";
            case "Silver" -> "은";
            case "Bronze" -> "동";
            default -> "노";
        };
        System.out.println(message);
    }
}
