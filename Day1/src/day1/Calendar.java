package day1;

public class Calendar {

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDate(12,"Dec",2012);
//        d1.display();
        nEWdATE date = new nEWdATE();
        date.setDay(11);
        date.setMonth("Jan");
        date.setYear(2004);

        System.out.println(date);
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println();



    }
}
