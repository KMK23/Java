package chapter11.string;

public class StringTest {
    public static void main(String[] args) {

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1 == str2);
//
//        String str3 = "abc";
//        String str4 = "abc";
//
//        System.out.println(str3 == str4);
//

        String str1 = new String("java");
        String str2 = new String("android");
        System.out.println(System.identityHashCode(str1));
        str1 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));

//      새로운 메모리가 생기고 새로운 생성된 문자열 자체를 가르킨다.
//      즉 str1 에 붙는게 아니고 그냥 새로 생성된것이다.
//      쓰지 않는 쓰레기 메모리들이 계속 생긴다. 그럼 좋지 않아
//      문자열을 자꾸 연결해야한다면 StringBuilder, StringBuffer
//      StringBuffer 는 동기화를 보장.
//      단일 쓰레드 프로그램에서는 StringBuilder를 사용하기를 권장
//      특징 : 내부적으로 가변적인 char[] 배열을 가지고 있는 클래스.
//          : 문자열을 여러 번 연결하거나 변경할 때 사용하면 유용함.


    }
}
