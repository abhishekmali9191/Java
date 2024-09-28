package day5;

public class MathNew {

    public static void divide (String s1, String s2) throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException
    {
        int dividend = Integer.parseInt(s1);
        int divisor = Integer.parseInt(s2);

        int res = dividend/divisor;
        System.out.println("Result of division is : "+res);
    }

    public static void main(String[] args) {
        try
        {
            divide(args[0],args[1]);
        }
        // Multi - catch block
        catch (ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e)
        {
            System.out.println(e);
        }

    }
}
