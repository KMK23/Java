package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("java");

        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);

        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer));

        String str2 = buffer.toString();
        System.out.println(str2);

        Integer i = new Integer(100);
        int j = 200;
        int sum = i + j;
        System.out.println(sum);
        Integer num3 = j;
        System.out.println(num3);

    }
}
