package day3;

public class Manager extends SalariedEmployee{
    protected double allowances;
    public Manager(int empid, String name, double basic, double allowances) {
        super(empid, name, basic);
        this.allowances=allowances;
    }

    @Override
    public double calculateGross() {
        double total= super.calculateGross();
        double netTotal= total+total*(allowances/100);
        return netTotal;
    }
}
