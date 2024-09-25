package day2;
import day1.Date;

public class Array {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15};
//        int arr[] = {12,13,14,15};

        for (int n: arr) {
            if (n%2==0)
                System.out.println("Number is even");
            else
                System.out.println("Number is odd");
        }
        Date []dd = new Date[3];             // create the object of date, whose reference is stored in array
        dd[0] = new Date();                  // in case of object, we need to create object separately
        dd[0].setDate(12,"Aug", 2000);
        dd[0].display();
        dd[1] = new Date();
        dd[1].setDate(12,"Aug", 2001);
        dd[1].display();
        dd[2] = new Date();
        dd[2].setDate(12,"Aug", 2002);
        dd[2].display();
        for(Date d:dd)
        {
            d.display();
        }
    }
}
