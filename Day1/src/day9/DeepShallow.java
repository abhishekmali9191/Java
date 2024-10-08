package day9;

import java.util.ArrayList;
import java.util.List;

public class DeepShallow implements Cloneable {
    int value;

    public DeepShallow(int value) {
        this.value = value;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepShallow original = new DeepShallow(10);
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        DeepShallow shallowCopy = original;
        shallowCopy.value = 20;
        System.out.println("Original : " + original.value);
        System.out.println("Shallow Copy : " + shallowCopy.value);

        DeepShallow deepCopy = (DeepShallow) original.clone();
        deepCopy.value = 30;
        System.out.println("Original : " + original.value);
        System.out.println("Deep Copy : " + deepCopy.value);
        List<String> temp = new ArrayList<>(color);
        List<String> temp1=color;
        System.out.println("original : "+color);
        System.out.println("temp1 : "+temp1);
        System.out.println("temp : "+temp);
        color.set(1,"Pink");
        System.out.println("original : "+color);
        System.out.println("temp : "+temp);
        System.out.println("temp1 : "+temp1);
    }

}