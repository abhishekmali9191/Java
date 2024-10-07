package day9;

public class Synchronization {
    public static void main(String[] args) {
        Counter c =new Counter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    for (int i = 0; i < 50; i++) {
                        c.increment();
                        System.out.println(Thread.currentThread().getName() + " : " + c.getCount());
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    for (int i = 0; i < 50; i++) {
                        c.increment();
                        System.out.println(Thread.currentThread().getName() + " : " + c.getCount());
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}
