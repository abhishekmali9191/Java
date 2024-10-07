package day9;

public class ProdCons {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.setValue(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.getValue();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread producer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.setValue(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread consumer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.getValue();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread producer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.setValue(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread consumer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    queue.getValue();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        producer.start();
        producer1.start();
        consumer.start();
        consumer2.start();
        consumer1.start();
        producer2.start();

    }
}
