package day1;

public class Account {
    private int acc_id;
    private String name;
    private static float interest_rate = 7.0f;
    //Default constr
    public Account()
    {
        acc_id=1000;
        name="aaa";
    }

    //parameterized Constr
    public Account(int acc_id, String name)
    {
        this.acc_id=acc_id;
        this.name=name;
    }

    public void displayInterestRate()
    {
        System.out.println("Account id is : "+ this.acc_id+"And name of the account holder is : "+this.name);
        System.out.println("Current Interest Rate for the account is : "+interest_rate +"%");
    }

}
