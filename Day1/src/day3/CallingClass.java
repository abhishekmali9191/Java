package day3;

public class CallingClass {
    public static void main(String[] args)
    {
        Manager m1 = new Manager(101,"Abhishek",50000,20);
        System.out.println(m1);
        System.out.println("Gross salary of manager is : "+ m1.calculateGross());
        System.out.println("Net Salary for manager is : "+ m1.calculateNet());

        ContractEmployee c1 = new ContractEmployee(201,"Sammak",100,5);
        System.out.println(c1);
        System.out.println("gross salary of contract employee is : "+ c1.calculateGross());
    }
}
