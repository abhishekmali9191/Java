package day3;

import java.util.Arrays;

public class StringManipulation {
    public static void isAnagram(String s1, String s2)
    {
        if(s1.length()==s2.length())
        {
            char [] c1 = s1.toCharArray();
            char [] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1,c2))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
        else
            System.out.println("Not an Anagram");
    }
    public static void charCount(String s) {
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                upperCount++;
            else if (c >= 'a' && c <= 'z')
                lowerCount++;
            else if (c==' ')
                continue;
            else
                specialCount++;
        }
        System.out.println("Upper Char Count : " + upperCount);
        System.out.println("Lower Count : " + lowerCount);
        System.out.println("Special Count : " + specialCount);
    }

    public static boolean isUpper(String s){
        char[] c = s.toCharArray();
        for (char chr : c){
            if(chr<='A' && chr>='Z')
                return false;
        }
        return true;
    }

    public static String leftShiftChar(String s, int n){
        char[] c = s.toCharArray();
        int x=0;
        while (x<n)
        {
            char a = c[0];
            for (int i = 0; i < c.length-1; i++)
            {
                c[i]=c[i+1];
            }
            c[c.length-1]=a;
            x++;
        }
        String sNew = "";
        for(char ch :c)
        {
            sNew += ch;
        }
        return sNew;
    }

    public static void main(String[] args) {
        String s1="expect";
        String s2 = "execpt";
        isAnagram(s1,s2);
        String s= "Abhi shek @123";
        charCount(s);
        String s3 = "ABHISHEK";
        String s4= "AbhIshek";
        System.out.println(isUpper(s3));
        System.out.println("Left Shifiting the  string by 2 will gives us : " +leftShiftChar(s3,2));
        System.out.println("Comparing String by Ignore Case : "+s3.equalsIgnoreCase(s4));     // upper and lower case are ignored and then compared
        System.out.println("Equals Method implementation : "+s3.equals(s4));
    }
}
