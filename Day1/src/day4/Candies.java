package day4;

public class Candies extends Dessert{
    protected double candyPrice;

    public Candies(double quantity,String flavour) {
        super(quantity,flavour);
        if(flavour.equalsIgnoreCase("chocolate"))
            this.candyPrice=150;
        else if (flavour.equalsIgnoreCase("vanila"))
            this.candyPrice=200;
        else if (flavour.equalsIgnoreCase("mango"))
            this.candyPrice=300;
        else
            this.candyPrice=100;

    }

    @Override
    public double calculatePrice() {
        return (quantity/1000)*candyPrice;
    }

    @Override
    public String displayName() {
        return "Dessert Type : Candy , Dessert Flavour : "+ flavour+ ", Quantity in Grams : "+ quantity+ ", And Price per Kg = "+candyPrice;
    }
}
