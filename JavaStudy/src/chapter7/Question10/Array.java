package chapter7.Question10;

public class Array {
    public static void main(String[] args) {

        char[][] alphabets = new char[13][2];
        char ch = 'a'; //97

        for(int i = 0; i < alphabets.length; i++){
            for(int j = 0; j < alphabets[i].length; j++){
                alphabets[i][j]= ch;
                System.out.print(alphabets[i][j] + " ");
                ch++;
            }
            System.out.println();
        }


    }

}
