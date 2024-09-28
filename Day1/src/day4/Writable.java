package day4;

public interface Writable {
    void write();
    default void foo()
    {
        System.out.println("Hello From foo from writable  ");
    }
}
