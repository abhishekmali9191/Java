package day4;

public class Cookies extends Dessert{
    double cookiePrice;
    protected String name="Cookie";
    public Cookies(double quantity,String flavour) {
        super(quantity,flavour);
        if(flavour.equalsIgnoreCase("chocolate"))
            this.cookiePrice=180;
        else if (flavour.equalsIgnoreCase("vanila"))
            this.cookiePrice=240;
        else if (flavour.equalsIgnoreCase("mint"))
            this.cookiePrice=300;
        else
            this.cookiePrice=120;
    }

    @Override
    public double calculatePrice() {
        return quantity*(cookiePrice/12);
    }

    @Override
    public String displayName() {
        return "Dessert Type : Cookies , Dessert Flavour : "+ flavour+ ", Quantity in nos : "+ quantity+ ", And Price per Dozzen = "+cookiePrice;
    }
}
