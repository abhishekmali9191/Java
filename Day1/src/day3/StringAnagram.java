package day3;

import java.util.Arrays;
import java.util.Collections;

public class StringAnagram {
    public static void main(String[] args) {
//        Check if strings are anagram
        String s1 = "except";
        String s2 = "expect";
//        char [] c1 = s1.toCharArray();
//        char [] c2 = s2.toCharArray();
        if(s1.length()==s2.length()) {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
            if (count == s1.length())
                System.out.println("The Strings are anagram");
            else
                System.out.println("Not anagram");
        }
        else
        {
            System.out.println("Not Angram");
        }

    }
}
