package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DemoList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(120);
        list.add("Abhi");
        list.add(23.4f);
        list.add(true);
        System.out.println("Printing the list by for loop");
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("Printing the list by for each loop");
        for(Object obj: list)
        {
            System.out.println(obj);
        }
        list.remove("Abhi");
        System.out.println("Printing the list using iterator class");
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
