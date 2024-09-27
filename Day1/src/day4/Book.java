package day4;

public class Book implements Printable, Writable {
    private String title;
    private int price;

    public Book(String title,int price)
    {
        this.title=title;
        this.price=price;
    }

    @Override
    public void write() {
        System.out.println("Writing a book...");
    }

    @Override
    public void print() {
        System.out.println("Printing a book...");
    }
}
