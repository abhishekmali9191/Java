package day4;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        int count=0;

        while (true)
        {
            System.out.println("*************************  Welcome to The Store   ***********************");
            System.out.println("What do you Want to Buy \nCandies \nCookies \nIceCream \nExit");
            String item = sc.next();
            count++;
            if (item.equalsIgnoreCase("candies"))
            {
                System.out.println("Candies Menu  \nFlavour      Price/Kg\nChocolate    150/kg\nvanila       200/kg\nmango        300/kg\nnormal       100/kg");
                System.out.println("Enter flavour : ");
                String flavour = sc.next();
                System.out.println(" Enter Quantity in Grams : ");
                double quantity = sc.nextDouble();
                Dessert d1 = new Candies(quantity,flavour);
                cart.addToCart(d1);
            }
            else if (item.equalsIgnoreCase("cookies"))
            {
                System.out.println("Cookies Menu  \nFlavour      Price/dozzen\nChocolate    180/dozzen\nvanila       240/dozzen\nmint         300/dozzen\nnormal       120/dozzen");
                System.out.println("Enter flavour : ");
                String flavour = sc.next();
                System.out.println(" Enter Quantity in Pieces : ");
                double quantity = sc.nextDouble();
                Dessert d1 = new Cookies(quantity,flavour);
                cart.addToCart(d1);

            }
            else if (item.equalsIgnoreCase("icecream"))
            {
                System.out.println("IceCream Menu  \nFlavour      Price/piece\nChocolate    40/piece\nvanila       50/piece\nbutterscotch 60/piece\nnormal       35/piece");
                System.out.println("Enter flavour : ");
                String flavour = sc.next();
                System.out.println(" Enter Quantity in Pieces : ");
                double quantity = sc.nextDouble();
                Dessert d1 = new Icecream(quantity,flavour);
                cart.addToCart(d1);

            }
            else
                System.out.println("Invalid Input..");

            System.out.println("Do You Want to Continue Shopping \n1.Yes   2.NO");
            String x = sc.next();
            if(x.equalsIgnoreCase("no"))
                break;
        }
        System.out.println("Total number of items : "+count);
        cart.displayTotalBill();
    }
}
