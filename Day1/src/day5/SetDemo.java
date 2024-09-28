package day5;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set  = new HashSet<>();
        set.add(12);
        set.add(12);
        set.add(15);
        set.add(14);
        set.add(13);
        set.add(13);

        for(Integer i : set){
            System.out.println(i);
        }
        set.remove(14);
        System.out.println(set.contains(13));


    }
}
