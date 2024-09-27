package day3;

public class ContractEmployee extends Employee{
    protected double renumeration;
    protected int hours;
    public ContractEmployee(int empid, String name, double renumeration, int hours)
    {
        super(empid, name);
        this.renumeration=renumeration;
        this.hours=hours;
    }

    @Override
    public double calculateGross() {
        double totalSalary = renumeration*(double)hours;
        return totalSalary;
    }

}
