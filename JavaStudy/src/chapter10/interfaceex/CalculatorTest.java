package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();

//      interface는 당연히 new 할수 없지
//        Calc calc1 = new Calc();
//      이것도 당연히 안되지 추상클래스니까
//        Calc calc2 = new Calculator();

        System.out.println(calc.add(num1, num2));
        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
       int sum =  Calc.total(arr);
        System.out.println(sum);


    }
}
