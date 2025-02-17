package chapter10.interfaceex;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0){
            return num1 / num2;
        }
        return Error;
    }
    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

    @Override
    public void description() {
        System.out.println("완벽한 계산기 입니다.");
    }

    //    extends
//    대상 : 클래스 -> 클래스
//    구현 여부 : 모든 추상 메서드 구현 필요
//    특징 : 일부만 구현하면 추상 클래스가 됨
}
