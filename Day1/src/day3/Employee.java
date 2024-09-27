package day3;

public abstract class Employee {
    protected int empid;
    protected String name;

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public abstract double calculateGross();

    @Override
    public String toString() {
        return "Employee Data : Id : " + empid + " Name : "+ name;
    }
}
