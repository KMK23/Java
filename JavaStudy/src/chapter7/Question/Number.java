package chapter7.Question;

public class Number {
    public static void main(String[] args) {
    int[] arr = new int[5];
    int index = 0;
    int total = 0;

    for(int i = 1; i<11; i++){
        if(i % 2 == 0){
            arr[index] = i;
            index++;
        }
    }

        System.out.println("배열 요소: ");
    for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
        total += arr[i];
    }
        System.out.println();
        System.out.println("총합: " + total);
}}
