package chapter4;

public class SwitchCase2 {
    public static void main(String[] args) {
        int month = 10;
        int day;

        switch (month){
            case 1: case 3: case 5:case 7:case 8:case 10:case 12:
                day=31;
                break;
             case 4: case 6: case 9: case 11:
                day=30;
                break;
            case 2:
                day=28;
                break;
            default:
                day=0;
                break;
        }
        System.out.println(month+"월은 "+day+"까지 입니다.");
    }
}
