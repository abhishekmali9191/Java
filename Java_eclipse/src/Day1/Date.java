package Day1;

public class Date {
	// Declaring Variable
    private int day;
    private String month;
    private int year;

    // Method declaration
    public void setDate(int d, String s, int y){
        day=d;
        month=s;
        year=y;
    }
    public void display(){
        System.out.println("Date : "+day+" Month : "+month+" year: "+year);
    }
    public static void addition(int... num)
    {
        int res=0;
        for(int n : num)
        {
            res += n;
        }
        System.out.println("The result of addition is : "+res);
    }

    public static void main(String[] args) {
        addition(1,23,24,12,12,11,1,2,3);
    }
}
