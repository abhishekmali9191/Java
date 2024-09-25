package day1;

import javax.xml.namespace.QName;

public class Student {
    private final String name;
    private final int division;
    private final float grade;
    private static int count=0;
    private final int rollNo;

    public Student(String name, int division, float grade)
    {
        count++;
        this.name=name;
        this.division=division;
        this.grade=grade;
        this.rollNo=count;

    }
    public  void printStudentDetails()
    {
        System.out.println("Name : "+ name+" division : "+division+" Grades : "+grade+" Roll Number : "+rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Abhishek",10,98.5f);
        Student s2 = new Student("Sammak",3,28.5f);
        Student s3 = new Student("Jay",12,97.5f);
        s1.printStudentDetails();
        s2.printStudentDetails();
        s3.printStudentDetails();

    }


}
