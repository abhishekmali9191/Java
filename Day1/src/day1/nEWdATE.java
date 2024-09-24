package day1;

public class nEWdATE {
    private int day;
    private String month;
    private int year;

    public void setDay(int day) {
        if(day<0) {
            System.out.println("Invalid day input.");
        } else {
            this.day = day;
        }
    }

    public int getDay() {
        return day;
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

    @Override
    public String toString() {            // invoke automatically
        return "Date : "+day+"/" +month+"/"+year;
    }
}
