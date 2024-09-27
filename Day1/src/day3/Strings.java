package day3;

import javax.print.attribute.Size2DSyntax;
import java.nio.charset.StandardCharsets;

public class Strings {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = "Java";
        String s2 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s.compareTo(s2));
        if(s2==s4)
        {
            System.out.println("Equal");
        }
        if (s1.equals(s2))
            System.out.println("s1 equals s2");
        System.out.println(s2.getBytes());
        System.out.println(s1.getBytes());
        System.out.println(s4.getBytes());
        System.out.println(s2+s4);
        s2 = s2.concat(" World");
        System.out.println(s2);
        System.out.println(String.valueOf(s4));


        System.out.println(s.hashCode()+" "+s1.hashCode()+" "+s2.hashCode());
    }
}
