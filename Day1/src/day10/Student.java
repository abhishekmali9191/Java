package day10;

public class Student {

    private int rollNo;
    private String name;
    public Student()
    {
        name= "aaa";
        rollNo=100;
    }
    public Student(int rollNo, String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }
    private void privateMethod()
    {
        System.out.println("This is private Method...");
    }
    public static void staticMethod()
    {
        System.out.println("This is static Method...");
    }
    public void methodWithParam(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
        System.out.println("Roll no is set to : "+rollNo);
    }

    @CreatedBy(priority = 1,createdBy = "Abhishek")
    public void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
    }
}
