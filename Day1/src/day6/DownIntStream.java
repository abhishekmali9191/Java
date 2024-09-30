package day6;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DownIntStream {

    public static void main(String[] args) {
        int[] nums = {12,4,7,10,23,546,456,564,45,3,4,6,4,34,543,345,434,34,34,34};
        IntStream stream = Arrays.stream(nums);

        System.out.println(stream.count());
        stream = Arrays.stream(nums);
        System.out.println(stream.distinct().sorted().count());

        stream = Arrays.stream(nums);
        stream.distinct().sorted().forEach((n) -> System.out.println(n));

        stream = Arrays.stream(nums);
        stream.distinct().sorted().forEach(System.out::println);            // method reference

        stream = Arrays.stream(nums);
        List<Integer> square = stream.map((n) -> n*n).boxed().collect(Collectors.toList());
        System.out.println(square);

        stream = Arrays.stream(nums);
        List<Integer> even = stream.filter((n) -> n%2==0).boxed().collect(Collectors.toList());
        System.out.println(even);
    }
}
