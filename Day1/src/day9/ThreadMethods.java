package day9;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread(new Thread2());

        t1.setName("One");
        t2.setName("Two");

        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        for (int i =0; i<10;i++){

            if (i==5) {
                Thread.currentThread().yield();
            }
            else
                System.out.println("Main Thread :" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
