package day6;

public class Stat <T extends Number>{
    T [] num;

    public void setValue(T [] num)
    {
        this.num=num;
    }
    public double getAverage()
    {
        double sum = 0;
        for(int i=0;i< num.length;i++)
        {
            sum += num[i].doubleValue();
        }
        return sum/ num.length;
    }

    public static void main(String[] args) {
        Integer [] arr1 = {12,34,56,78,98,76};
        Stat<Integer> stat1 = new Stat<>();
        stat1.setValue(arr1);
        System.out.println(stat1.getAverage());

        Double [] arr2 = {12.43,34.23,56.21,78.56,98.55,76.43};
        Stat<Double> stat2 = new Stat<>();
        stat2.setValue(arr2);
        System.out.println(stat2.getAverage());

        Number [] arr3 = {10,10.00,10.0f,20};
        Stat<Number> stat3 = new Stat<>();
        stat3.setValue(arr3);
        System.out.println(stat3.getAverage());

//        String [] arr4 = {"Hello"," World"};
//        Stat<String> stat4 = new Stat<>();
//        stat4.setValue(arr4);
//        System.out.println(stat4.getAverage());

    }
}
