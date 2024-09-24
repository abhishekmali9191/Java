package day1;

import java.util.Scanner;

public class Math {

    public static void factorial(int num)
    {
        long fact = 1;
        for(int i =1;i<=num;i++)
        {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);

    }
    public static boolean isPrime(int num)
    {
        int count=0;

        for(int i=2 ; i<num ; i++)
        {
            if (num%i==0){
                count++;
            }
        }
        if (count>0)
        {
            System.out.println("The Number is not prime");
            return false;
        }
        else
        {
            System.out.println("The Number "+num+" is Prime");
            return true;
        }
    }

    // Method overloading example
    public int add(int a , float b){

        return a + (int)b;
    }
    public float add(float b,int a){
        return (float)a+b;
    }




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        factorial(num);
        System.out.println(isPrime(93));

    }

}

