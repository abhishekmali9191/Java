package day5;
import java.util.Set;
public class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private double salary;
    private Set<String> skillsets;
    public Employee(int empId, String name, double salary, Set<String> skillsets) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.skillsets = skillsets;
    }
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
    public Set<String> getSkillsets() {
        return skillsets;
    }
    public void setSkillsets(Set<String> skillsets) {
        this.skillsets = skillsets;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillsets=" + skillsets +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
         return this.empId - o.empId; // ascending
//        if(this.empId <= o.empId)
//            return -1;
//        else
//            return 1;

    }
}
