package day3;

public class CallingClass {
    public static void main(String[] args)
    {
        Payroll payroll = new Payroll();

        SalariedEmployee se = new SalariedEmployee(101,"Sammak",50000);
        System.out.println(se);
        payroll.displayGross(se);
        payroll.displayNet(se);
        System.out.println("******************************************************************************");
        Employee e = new SalariedEmployee(201,"Bapat",60000);  // upcasting of salariedEmployee to Employee class reference
        System.out.println(e);
        payroll.displayGross(e);
     //   payroll.displayNet(e);        here this is not allowed because display net requires object of salaried Employee
        System.out.println("******************************************************************************");
        Employee [] emp = new Employee[3];
        emp[0]= new SalariedEmployee(301,"Gagan",50000);
        emp[1]= new Manager(101,"Abhishek",50000,20);
        emp[2]= new ContractEmployee(201,"Mayuresh",100,5);
        /*
        CalculateGross() is defined in Employee and overridden in Salaried Employee
        hence can be invoked using Employee reference emp[0]
         */
        System.out.println(emp[0]);
        payroll.displayGross(emp[0]);
        // payroll.displayNet(emp[0]);                not allowed
        /*
        To invoke calculateNet() which is defined in salariedEmployee
        the Employee Reference must be down casted to salariedEmployee
         */
        SalariedEmployee ss = (SalariedEmployee)emp[0];               // down Casting Syntax
        payroll.displayNet(ss);    // this can invoke the calculateNet()
        System.out.println("******************************************************************************");
        System.out.println(emp[1]);
        payroll.displayGross(emp[1]);
        SalariedEmployee sm =(SalariedEmployee)emp[1];
        payroll.displayNet(sm);
        System.out.println("******************************************************************************");
        System.out.println(emp[2]);
        payroll.displayGross(emp[2]);

        for(Employee employee : emp)
        {
            payroll.displayGross(employee);
            if(employee instanceof Manager) //Type checking operator
                ((Manager)employee).getAllownces();
        }




//        Manager m1 = new Manager(101,"Abhishek",50000,20);
//        System.out.println(m1);
//        System.out.println("Gross salary of manager is : "+ m1.calculateGross());
//        System.out.println("Net Salary for manager is : "+ m1.calculateNet());
//        System.out.println("******************************************************************************");
//        ContractEmployee c1 = new ContractEmployee(201,"Sammak",100,5);
//        System.out.println(c1);
//        System.out.println("gross salary of contract employee is : "+ c1.calculateGross());
    }
}
