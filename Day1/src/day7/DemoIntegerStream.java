package day7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
    public static void main(String[] args) {
        Integer[] nums = {12, 4, 7, 10, 23, 546, 456, 564, 45, 3, 4, 6, 4, 34, 543, 345, 434, 34, 34, 34};
        List<Integer> lst = Arrays.asList(nums);
        System.out.println("----------------------------------");
        Stream<Integer> stream = lst.parallelStream();
        stream.map((n)-> Math.sqrt(n)).forEach(System.out::println);
        System.out.println("----------------Prime Numbers------------------");
        stream = lst.parallelStream();
        List<Integer> prims = stream.filter(day2.Math::isPrime).collect(Collectors.toList());
        System.out.println(prims);

        System.out.println("---------------Sorted-------------------");
        stream = lst.stream();
        stream.distinct().sorted(Integer::compareTo).forEach(System.out::println);

        System.out.println("---------------Sum-------------------");
        stream = lst.stream();
        Optional<Integer> total = stream.reduce((n1,n2)->n1+n2);
        if (total.isPresent())
            System.out.println(total.get());

        stream = lst.parallelStream();
        long sum = stream.reduce(1,(n1,n2)->n1+n2);
        System.out.println(sum);

        System.out.println("---------------Minimum-------------------");
        stream = lst.stream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent())
            System.out.println(min.get());

        System.out.println("---------------Average-------------------");
        stream = lst.stream();
        OptionalDouble ave = stream.mapToDouble(Double::valueOf).average();
        if (ave.isPresent())
            System.out.println(ave.getAsDouble());
    }
}
