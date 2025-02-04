package chapter7.array;

public class Twodimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

//        for(int i = 0; i<arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.println(arr[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);

        char ch = 'A'; //65

        char[][] alphabets = new char[13][2];
        for (int i = 0; i< alphabets.length; i++){
            for(int j = 0; j < alphabets[i].length; j++){
                alphabets[i][j] = ch;
                ch++;
            }
        }
        for (int i = 0; i <alphabets.length; i++){
            for (int j = 0; j < alphabets[i].length; j++){
                System.out.print(alphabets[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
