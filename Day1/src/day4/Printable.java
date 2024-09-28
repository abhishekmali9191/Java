package day4;

public interface Printable {
    void print();
    default void foo()
    {
        System.out.println("Hello From foo from printable  ");
    }
}
