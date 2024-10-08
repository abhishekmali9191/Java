package day1;

public class Date {

    // Declaring Variable
    private int day;
    private String month;         //instance variable
    private int year;

    public Date()
    {
        day=1;
        month="Jan";               //local variable
        year=2024;
    }
    public Date(int d, String s , int y)
    {
        day=d;
        month=s;               //local variable
        year=y;
    }

    // Method declaration
    public void setDate(int d, String s, int y){
        day=d;
        month=s;               //local variable
        year=y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println("Date : "+day+" Month : "+month+" year: "+year);
    }
}
