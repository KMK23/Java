package chapter4;

public class chapter4Q1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '*';
        if(operator == '+'){
        System.out.println(num1+num2);
        } else if (operator == '-') {
            System.out.println(num1-num2);
        } else if (operator == '*') {
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }

        switch (operator){
        case '+' :
        System.out.println(num1+num2);
        break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
    }
    }
}
