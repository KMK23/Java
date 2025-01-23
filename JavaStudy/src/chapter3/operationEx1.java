package chapter3;

public class operationEx1 {
    public static void main(String[] args) {
        int num = 24;

        System.out.println(+num);
        System.out.println(-num);
//       이렇게한다고 값이 -10이 되는게 아니다.
        System.out.println(num);

        num = -num;
//        num 값을 음수로 바꿔서 다시 num에 대입함
        System.out.println(num);
//        이렇게 해야 값이 -10으로 나온다



    }
}
