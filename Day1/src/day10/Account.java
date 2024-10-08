package day10;

public class Account {
    private double balance;
    public Account(double balance)
    {
        this.balance=balance;
    }
    public synchronized void withdraw(double amount)
    {
        if(amount>balance)
        {
            try {
                System.out.println("Insufficient balance ");
                System.out.println("Waiting for someone who will deposit some money to your account.....");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else
        {
            balance-=amount;
        }

        System.out.println("Amount of Rs."+amount+" has been withdrawn from Your account");
        System.out.println("Available balance is : "+balance);
    }
    public synchronized void deposit(double amount)
    {
        balance+=amount;
        notify();
        System.out.println("Amount of Rs."+amount+" has been deposited in Your account successfully....");
        System.out.println("Available balance is : "+balance);

    }

    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Thread withdraw = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++)
                {
                    a1.withdraw(400);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread deposit = new Thread(new Runnable() {
            @Override
            public void run() {
                a1.deposit(300);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        });

        withdraw.start();
        deposit.start();


    }
}
