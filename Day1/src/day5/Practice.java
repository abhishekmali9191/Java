package day5;

public class Practice {
    public static void deposit(Account a,double amount){
        try {
            a.depositAmount(amount);
        } catch (IncorrectDenominationException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void withdraw(Account a,double amount){
        try {
            a.withdrawAmount(amount);
        } catch (InsufficientFundException|TransactionLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws InsufficientFundException, IncorrectDenominationException, TransactionLimitExceededException {
        Account a1 = new Account(101,"Abhishek",1000);
//        a1.depositAmount(500);
//        a1.depositAmount(200);
        Practice.deposit(a1,210);
        Practice.deposit(a1,200);
        Practice.deposit(a1,310);
        Practice.deposit(a1,300);
        Practice.withdraw(a1,500);
        Practice.withdraw(a1,500);
        Practice.withdraw(a1,600);
        Practice.withdraw(a1,400);
        Practice.withdraw(a1,100);

    }
}
