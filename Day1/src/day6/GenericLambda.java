package day6;

import java.util.Date;

public class GenericLambda {
    public static <T> T operateOnData(GenericLambdaInterface <T> gli, T data) {
        return gli.apply(data);
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i=s.length()-1; i>=0;i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String substring = operateOnData((s) -> s.substring(3), "Java 11");
        System.out.println(substring);

        Integer square = operateOnData((n) -> n*n, 24);
        System.out.println(square);

        Date today = new Date(124, 0, 31);

        Date tomorrow = operateOnData((d) -> new Date(today.getYear(), today.getMonth(), today.getDate()+1), today);
        System.out.println(today);
        System.out.println(tomorrow);

        String upper = operateOnData(String::toUpperCase, "Lambda");
        System.out.println(upper);
        String reverse = operateOnData(GenericLambda::reverse, "Lambda");
        System.out.println(reverse);

    }
}
