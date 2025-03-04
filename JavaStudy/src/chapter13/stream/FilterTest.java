package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
//      양수를 찾는 Predicate
        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 8);
//      여기있는 asList 는 배열을 리스트로 변환시켜주는것
//        Collection (인터페이스)
//          └ List (인터페이스)
//              ├ ArrayList (클래스)
//              ├ LinkedList (클래스)
        Stream<Integer> s = numbers.stream().filter(isPositive);
        s.forEach(integer -> System.out.println(integer));
        System.out.println("====================");
        List<String> list = List.of("Peter", "Thomas", "Edvard", "Gerhard");

        // print using lambda
        list.forEach(item -> System.out.println(item));
        System.out.println("====================");
        // print using :: (method reference operator)
        list.forEach(System.out::println);
    }
}
