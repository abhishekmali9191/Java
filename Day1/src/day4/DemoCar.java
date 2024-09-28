package day4;

public class DemoCar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("aaa","bbb",10000);
        Car c2 = new Car("aaa","bbb",10000);
        System.out.println(c1);
        System.out.println(c2==c1);
        System.out.println(c1.equals(c2));

        Car c3 = (Car)c1.clone();
        System.out.println(c3);
    }
}
