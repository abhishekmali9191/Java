package day2;

import day1.Date;
import day1.nEWdATE;

public class Math {
    /*
    parameters in java are passed by value: only a copy of variable data is passed from calling methods, not the actual data;
    When an array/reference variable is passed it passes the copy of references to the called method not the actual object

     */
    public static int increment(int num)
    {
        num++;
        return num;
    }
    public static void incrementDate(nEWdATE d)
    {
        int day= d.getDay();
        d.setDay(day+1);
    }
    public static void swapDates(Date d1, Date d2)
    {
        Date temp = null;
        temp=d1;
        d1=d2;
        d2=temp;
    }

    public static void main(String[] args)
    {
        int n=10;
        System.out.println("Before Increment : "+n);
        n=increment(n);
        System.out.println("After Increment : "+n);
        nEWdATE dd1= new nEWdATE(23,"May",2023);
        System.out.println(dd1.toString());
        incrementDate(dd1);
        System.out.println(dd1.toString());
        Date date1= new Date();
        Date date2= new Date();

        date1.setDate(12,"Aug",2012);
        date2.setDate(16,"May",2023);
        System.out.print("Before Swap : Date 1= ");
        date1.display();
        System.out.print("Before Swap : Date 2= ");
        date2.display();
        swapDates(date1,date2);
        System.out.print("After Swap : Date 1= ");
        date1.display();
        System.out.print("After Swap : Date 2= ");
        date2.display();


    }
}