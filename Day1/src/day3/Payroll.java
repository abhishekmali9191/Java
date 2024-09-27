package day3;

public class Payroll {
    public void displayGross(Employee e)
    {
        System.out.println("Gross salary : "+e.calculateGross());
    }
    public void displayNet(SalariedEmployee e)
    {
        System.out.println("Net salary : "+e.calculateNet());
    }
}
