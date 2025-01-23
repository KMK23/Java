package chapter4;

public class chapter4Q10 {
    public static void main(String[] args) {
        int floor = 2;
        String message = switch(floor){
            case 1 -> "약국";
            case 2 -> "정형외과";
            case 3 -> "피부과";
            case 4 -> "치과";
            case 5 -> "헬스장";
            default -> "없음";
        };
        System.out.println(message);
    }
}
