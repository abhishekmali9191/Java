package day2;

public class AutoBoxing {
    public static void main(String[] args) {
        int i  = 5;
        Integer j = Integer.valueOf(i);              // primitive to wrapper
        System.out.println(j);

        int k = j.intValue();                        // wrapper to integer

        // Auto Boxing
        int a =12;
        Integer b = a;

        //Auto Unboxing
        int c = b;


        //parsing
        int x = Integer.parseInt("30");          // only possible for Strings
        Integer y = Integer.valueOf("40");
        System.out.println(x);
        System.out.println(y);
    }
}
