package chapter4;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 61;
        int charge=0;

        if(age < 8){
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중고등학생입니다.");
        } else if(age > 60){
            charge = 0;
            System.out.println("경로 우대 입니다.");
        }
        System.out.println("입장료는 "+ charge + "원입니다.");



    }
}
