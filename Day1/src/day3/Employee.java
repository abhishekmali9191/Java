package day3;

import day4.Printable;

public abstract class Employee implements Printable {
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

    @Override
    public void print() {
        System.out.println("Employee Data : Id : " + empid + " Name : "+ name);
    }
}
