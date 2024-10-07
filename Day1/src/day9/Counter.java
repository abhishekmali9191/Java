package day9;

public class Counter {
    int count = 0;

//    public void  increment() {
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
