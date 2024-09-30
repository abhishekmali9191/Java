package day6;

public class Toy implements Comparable<Toy>{
    protected int prod_id;
    protected String prod_name;
    protected double prod_price;
    protected Manufacture_Date purchase_date;
    protected String category;
    protected String age;
    public Toy(int prod_id, String prod_name, double prod_price, Manufacture_Date purchase_date,String category ,String age)
    {
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.prod_price=prod_price;
        this.purchase_date=purchase_date;
        this.category=category;
        this.age=age;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public Manufacture_Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Manufacture_Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Toy{" +
                " prod_name='" + prod_name + '\'' +
                ", prod_price=" + prod_price +
                ", category='" + category + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Toy t) {
        return this.prod_id - t.prod_id;
    }
}
