package day9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> queue = new LinkedList<>();
    boolean hasValue=false;

    public synchronized void setValue(int value) {
        if(hasValue)
        {
            try {
                wait();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        hasValue = true;
        notify();
        queue.add(value);
        System.out.println("Set value : "+queue);
    }

    public synchronized void getValue() {
        if(!hasValue)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasValue=false;
        notify();
        System.out.println("Get value : "+queue.peek());
    }


}
