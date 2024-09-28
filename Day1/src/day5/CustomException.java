package day5;

import java.util.Scanner;

public class CustomException {


    public static void checkNumber(int number) throws BigException
    {
        if(number>60000)
            throw new BigException("Number is too big");
        else
            System.out.println("Number is in the range");
    }

    public static void main(String[] args) throws BigException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
//        try {
//            checkNumber(number);
//            System.out.println("Hello from try....");
//        } catch (BigException e) {
//            System.out.println(e);
//            e.printStackTrace();
//        }
        checkNumber(number);
        System.out.println("Hello ");

    }
}
