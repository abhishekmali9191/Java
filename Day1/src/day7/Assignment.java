package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mango");
        list1.add("orange");
        list1.add("Grapes");
        list1.add("apples");
        list1.add("Banana");
        list1.add("strawberry");
        list1.add("Watermelon");
        list1.add("BERRY");

        System.out.println(list1);

        // Create list of fruits in uppercase and lowercase
        System.out.println("-----------Upper Case---------------------");
        Stream<String> stream = list1.stream();
        List<String> uppercase = stream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);

        System.out.println("-------------lower case----------------------");
        stream = list1.stream();
        List<String> lowercase = stream.map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercase);

        // Create a list of fruits less than "n" in ascending order
        System.out.println("-------------Ascending of N----------------------");
        String n = "n";
        stream = list1.stream();
        List<String> lessThannASC = stream.filter(fruit -> fruit.compareToIgnoreCase(n) < 0).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(lessThannASC);


        // Create a list of fruits less than "n" in descending order;
        System.out.println("-------------descending of N----------------------");
        stream = list1.stream();
        List<String> lessThannDesc = stream.filter(fruit -> (fruit.toLowerCase()).compareTo(n) <0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());
        System.out.println(lessThannDesc);

        // Create a list of fruits with uppercase only

        System.out.println("-------------upper case fruits----------------------");
        stream = list1.stream();
        List<String> uppercaseOnly = stream.filter(fruit -> Character.isUpperCase(fruit.charAt(0))).collect(Collectors.toList());
        System.out.println(uppercaseOnly);

        // Create a list of fruit with 6 alphabets or less in descending order

        System.out.println("-------------Fruit less than of equal to 6 alphabets----------------------");
        stream = list1.stream();
        List<String> lessThanOrEqualToSixDesc = stream.filter(fruit -> fruit.length() <= 6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(lessThanOrEqualToSixDesc);
    }
}
