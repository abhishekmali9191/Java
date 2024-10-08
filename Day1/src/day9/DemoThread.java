package day9;

public class DemoThread {
    public static void main(String[] args) {
        // By extending Thread class
        Thread t1 = new Thread1();
        t1.start();

        // By implementing Runnable
        Thread t2= new Thread(new Thread2());
        t2.start();

        for (int i =0; i<10;i++){
            System.out.println("Main Thread :" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
