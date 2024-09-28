package day5;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeCollections {
    public List<Employee> initializeEmployeeData()
    {
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("C++");
        emplist.add(new Employee(101,"Abhi",50000, skills1));
        Set<String> skills2 = new TreeSet<>();
        skills2.add("Java");
        skills2.add("C");
        emplist.add(new Employee(201,"aaa",40000, skills2));
        Set<String> skills3 = new TreeSet<>();
        skills3.add("Python");
        skills3.add("C");
        emplist.add(new Employee(301,"bbb",30000, skills3));
        Set<String> skills4 = new TreeSet<>();
        skills4.add("Java");
        skills4.add("Python");
        emplist.add(new Employee(401,"ccc",45000, skills4));

        return emplist;
    }
    public void printList(List<Employee> emplist)
    {
        for(Employee e : emplist)
        {
            System.out.println(e);
        }
    }
    public Employee searchEmployee(List<Employee> emplist, int empId)
    {
        for (Employee emp : emplist)
        {
            if(emp.getEmpId()==empId)
                return emp;
        }
        return null;
    }
    public List<Employee> filterEmployees(List<Employee> emplist,String criteria)
    {
        List<Employee> filteredList = new ArrayList<>();
        for(Employee emp : emplist)
        {
            if(emp.getSkillsets().contains(criteria))
                filteredList.add(emp);
        }
        return filteredList;
    }
    public Map<Integer,Double> salMap(List<Employee> emplist)
    {
        Map<Integer, Double> salmap = new TreeMap<>();
        for(Employee emp : emplist)
        {
            salmap.put(emp.getEmpId(),emp.getSalary());
        }
        return salmap;
    }

    public static void main(String[] args) {
        EmployeeCollections e = new EmployeeCollections();
        List<Employee> emplist = e.initializeEmployeeData();

        e.printList(emplist);
        System.out.println("---------------------------------");
        System.out.println(e.searchEmployee(emplist,401));
        System.out.println("---------------------------------");
        System.out.println("Employees Having Skills as Java are : ");
        List<Employee> newList = e.filterEmployees(emplist, "Java");
        e.printList(newList);
        System.out.println("-----------------------------------------");
        System.out.println("Employees salary mapping ");
        Map<Integer, Double> salaryMap = e.salMap(emplist);
        for(Entry<Integer,Double> entry : salaryMap.entrySet())
        {
            System.out.println(entry.getKey()+" -->"+entry.getValue());
        }
        System.out.println("----------------------------------------");
        System.out.println("------Sort by Employee Id --------------");
        Collections.sort(emplist);
        e.printList(emplist);
        int index = Collections.binarySearch(emplist, new Employee(101,null,0,null));
        System.out.println("Found at Index : "+ index);

        System.out.println("------Sort by Employee Name -------------");
        Collections.sort(emplist, new NameComparator());
        e.printList(emplist);
//        index = Collections.binarySearch(emplist, new Employee(0,"aaa",0,null));
//        System.out.println("Found at Index : "+ index);

        System.out.println("------Sort by Employee Salary -----------");
        Collections.sort(emplist, new SalaryComparator());
        e.printList(emplist);
//        index = Collections.binarySearch(emplist, new Employee(0,null,40000.0,null));
//        System.out.println("Found at Index : "+ index);

        System.out.println("Minimum salary : ");
        System.out.println(Collections.min(emplist, new SalaryComparator()));
        System.out.println("Maximum salary : ");
        System.out.println(Collections.max(emplist, new SalaryComparator()));
        System.out.println("Reverse List based on salary ");
        Collections.reverse(emplist);
        e.printList(emplist);

    }
}
