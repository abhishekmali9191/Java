package day4;

public class Cart {
    protected double totalBill;

    public void addToCart(Dessert dessert)
    {
        System.out.println(dessert.displayName());
        System.out.println("Price for Current order is : "+dessert.calculatePrice());
        totalBill += dessert.calculatePrice();

    }
    public void displayTotalBill(){
        System.out.println("Total Bill of your order is " + totalBill);
    }
}
