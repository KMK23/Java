package chapter12.collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        Iterator<String> ir = treeSet.iterator();
        while (ir.hasNext()){
            String str = ir.next();
            System.out.println(str);
        }
    }
}
