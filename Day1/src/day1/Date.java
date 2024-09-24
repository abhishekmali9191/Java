package day1;

public class Date {

    // Declaring Variable
    private int day;
    private String month;         //instance variable
    private int year;

    // Method declaration
    public void setDate(int d, String s, int y){
        day=d;
        month=s;               //local variable
        year=y;
    }
    public void display(){
        System.out.println("Date : "+day+" Month : "+month+" year: "+year);
    }
}
