package chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class LimitTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("파인애플", "사과", "바나나", "귤");
        System.out.print("기본정렬 (오름차순) : " );
        fruits.stream().sorted().limit(2).forEach(s -> System.out.print(s + " "));


    }
}
