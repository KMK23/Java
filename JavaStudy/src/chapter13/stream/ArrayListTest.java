package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {

//        List<String> sList = new ArrayList<String>();
//        sList.add("T");
//        sList.add("J");
//        sList.add("E");
//
//        Stream<String> stream = sList.stream();
//        stream.forEach(s -> System.out.println(s));
//

        ArrayList<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("James");
        list.add("Edward");

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();
        list.stream().sorted().forEach(s -> System.out.println(s));
    }
}
