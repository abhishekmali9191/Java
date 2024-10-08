package day10;



import day1.Date;

import java.util.ArrayList;


public class TestImmutable {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("White");
        color.add("Black");

        Date mdate = new Date(10,"Dec",2020);

        Car c  = new Car("aaa","bbb",mdate,color);
        System.out.println(c);
        color.add("Red");
        mdate.setDay(12);
        System.out.println(c);
        System.out.println(c.getMandat());
        System.out.println(c.getColors());

    }
}
