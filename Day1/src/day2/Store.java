package day2;

import java.util.Scanner;

public class Store {

    public static void main(String[] args)
    {
      Flavour flavour = Flavour.CHOCOLATE;
      System.out.println("******************MENU*******************");
      Flavour [] menu= Flavour.values();
      for(Flavour f:menu)
      {
          System.out.println(f);
      }
        System.out.println("Enter the flavour of your choice : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        //to create an Enum object from string
        Flavour f1 = Flavour.valueOf(choice.toUpperCase());
        System.out.println("Selected flavour is : "+f1);
        System.out.println("Price for selected flavour "+f1.getPrice());
    }
}
