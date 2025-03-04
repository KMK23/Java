package chapter12.collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}


public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());

        treeSet.add("aaa");
        treeSet.add("bbb");
        treeSet.add("ccc");

        System.out.println(treeSet);

    }
}
