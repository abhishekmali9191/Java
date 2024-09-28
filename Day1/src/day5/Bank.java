package day5;

public class Bank {
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
        System.out.println(a1);
        deposit(a1,500);
        deposit(a1,210);    // this will raise the IncorrectDenominationException, "Please Deposit amount in multiple of 100."
        deposit(a1,200);
        deposit(a1,310);    // this will raise the IncorrectDenominationException, "Please Deposit amount in multiple of 100."
        deposit(a1,300);
        withdraw(a1,500);
        withdraw(a1,500);
        withdraw(a1,1100);  // this will raise the InsufficientFundException, "Insufficient Account Balance "
        withdraw(a1,400);
        withdraw(a1,500);   // this will raise the TransactionLimitExceededException, "Your Transaction Limit is Exceeded"
    }
}
