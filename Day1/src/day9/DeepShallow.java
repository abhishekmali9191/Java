package day9;

public class DeepShallow implements Cloneable {
    int value;
    public DeepShallow(int value)
    {
        this.value=value;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepShallow original = new DeepShallow(10);
        DeepShallow shallowCopy = original;
        shallowCopy.value=20;
        System.out.println("Original : "+original.value);
        System.out.println("Shallow Copy : "+shallowCopy.value);

        DeepShallow deepCopy = (DeepShallow)original.clone();
        deepCopy.value=30;
        System.out.println("Original : "+original.value);
        System.out.println("Deep Copy : "+deepCopy.value);
    }

