package day4;

public abstract class Dessert {
    protected double quantity;
    protected String flavour;



    public Dessert(double quantity,String flavour)
    {
        this.quantity=quantity;
        this.flavour=flavour;

    }

    public abstract double calculatePrice();
    public abstract String displayName();


}
