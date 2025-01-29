package chapter5.Question08;

public class FuntionTest {
    public static void main(String[] args) {
    int a = 20;
    int b = 10;

    int resultSum = add(a,b);
        System.out.println(a+"+"+b+"="+resultSum + "입니다");
    int resultSubStract=subStract(a,b);
        System.out.println(a+"-"+b+"="+resultSubStract + "입니다");
        int resultmultiply=multiply(a,b);
        System.out.println(a+"*"+b+"="+resultmultiply + "입니다");
        int resultdivide=divide(a,b);
        System.out.println(a+"/"+b+"="+resultdivide + "입니다");
    }
    public static int add(int a, int b){
        int add = a+b;
        return add;
    }
    public static int subStract(int a, int b){
        int subStract = a-b;
        return subStract;
    }
    public static int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    public static int divide(int a, int b){
        int divide = a / b;
        return divide;
    }
}


