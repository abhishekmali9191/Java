package day1;

public class variableArguments {

    public static void addition(int... num)
    {
        int res=0;
        for(int n : num)     //for each loop or enhanced for loop
        {
            res += n;
        }
        System.out.println("The result of addition is : "+res);
    }
    public static void main(String[] args) {
        addition(1,23,24,12,12,11,1,2,3);
    }
}
