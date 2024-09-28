package day5;

import day2.Array;

public class Math {
    public static void main(String[] args) {
        try
        {
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int res = dividend/divisor;
            System.out.println("Result of division is : "+res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Dividing by Zero");
            e.printStackTrace();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Enter integers only ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter 2 values as the dividend and divisor");
            System.out.println(e.getMessage());
        }
        System.out.println("After the exception handled");
    }
}
