package day4;

public class Icecream extends Dessert{
    double iceCreamPrice;
    protected String name="Ice Cream";
    public Icecream(double quantity,String flavour) {
        super(quantity,flavour);
        if(flavour.equalsIgnoreCase("chocolate"))
            this.iceCreamPrice=40;
        else if (flavour.equalsIgnoreCase("vanila"))
            this.iceCreamPrice=50;
        else if (flavour.equalsIgnoreCase("butterscotch"))
            this.iceCreamPrice=60;
        else
            this.iceCreamPrice=35;
    }

    @Override
    public double calculatePrice() {
        return quantity*iceCreamPrice;
    }

    @Override
    public String displayName() {
        return "Dessert Type : Ice Cream , Dessert Flavour : "+ flavour+ ", Quantity in nos : "+ quantity+ ", And Price per piece = "+iceCreamPrice;
    }
}
