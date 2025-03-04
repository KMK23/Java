package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//요소를 모으는 collect 연산
public class CollectTest {
    public static void main(String[] args) {
        Predicate<Integer> isPostive = x -> x > 0;

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 5);

        List<Integer> positiveNumbers = numbers.stream().filter(isPostive)
//               반환값을 리스트로 출력
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);

//      요소의 개수를 세는 count 연산도 있음
        long count = numbers.stream().filter(isPostive).count();
        System.out.println(count);
    }
}
