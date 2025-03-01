package chapter12.collection.hashset;

import java.util.HashSet;

public class HashsetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        boolean b1 = set.add("aaa");
        System.out.println(b1);
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);

        boolean b2 = set.add("aaa");
//      중복되게 넣었더니 중복되서 찍히지 않는다.
        System.out.println(set);
        System.out.println(b2);

    }
}
