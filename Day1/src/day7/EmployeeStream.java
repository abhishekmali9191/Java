package day7;



import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {

    public List<Employee> initializeEmployeeData()
    {
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("C++");
        emplist.add(new Employee(101,"Abhi",50000, skills1,"IT"));
        Set<String> skills2 = new TreeSet<>();
        skills2.add("Java");
        skills2.add("C");
        emplist.add(new Employee(201,"aaa",40000, skills2,"IT"));
        Set<String> skills3 = new TreeSet<>();
        skills3.add("Python");
        skills3.add("C");
        emplist.add(new Employee(301,"bbb",30000, skills3,"Admin"));
        Set<String> skills4 = new TreeSet<>();
        skills4.add("Java");
        skills4.add("Python");
        emplist.add(new Employee(401,"ccc",45000, skills4,"Admin"));

        return emplist;
    }

    public static void main(String[] args) {
        EmployeeStream e = new EmployeeStream();
        List<Employee> emplist = e.initializeEmployeeData();
        Stream<Employee> stream = emplist.stream();

        Comparator<Employee> byname = Comparator.comparing(Employee::getName);
        System.out.println("------Sorting by Name------------");
        stream.sorted(byname).forEach(System.out::println);

        stream = emplist.stream();
        Comparator<Employee> bydept =  Comparator.comparing(Employee::getDepartment).thenComparing(byname);
        System.out.println("------Sorting by Name for dept------------");
        stream.sorted(bydept).forEach(System.out::println);

        System.out.println("------------------emp b/w 50000 and 75000-------------------------");
        stream = emplist.stream();
        Predicate<Employee> salrange = (emp)->{
            if(emp.getSalary() >=50000 && emp.getSalary() <=75000)
                return true;
            else
                return false;
        };
        stream.filter(salrange).forEach(System.out::println);
        System.out.println("----------------Filter by skills---------------------------");
        stream = emplist.stream();
        stream.filter((emp)->emp.getSkillset().contains("Java")).forEach(System.out::println);

        System.out.println("----------------Group by Department---------------------------");
        stream = emplist.stream();
        Map<String, List<Employee>> empbydept = stream.collect(Collectors.groupingBy(Employee::getDepartment));
        empbydept.forEach((k,v)->System.out.println(k+" : "+v));

        System.out.println("--------------- Department class object--------------------------");
        stream = emplist.stream();
        stream.map((emp)-> new Department(emp.getEmpId(), emp.getDepartment())).forEach(System.out::println);


        System.out.println("----------------total salary--------------------------");
        stream = emplist.stream();
        double totalsal = stream.mapToDouble(Employee::getSalary).reduce(0,(e1,e2)->e1+e2);
        System.out.println(totalsal);
    }

}
