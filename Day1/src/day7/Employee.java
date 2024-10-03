package day7;

import java.util.Set;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private Set<String> skillset;
    private String department;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int empId, String name, double salary, Set<String> skillset, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.skillset = skillset;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillset=" + skillset +
                ", department='" + department + '\'' +
                '}';
    }
}
