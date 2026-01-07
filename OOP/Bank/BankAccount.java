package Bank;

public class BankAccount {

    long accountNo;
    String accountHolderName;
    double balance;


    BankAccount(long accNo , String accName , double balance){
        this.accountNo = accNo;
        this.accountHolderName = accName;
        this.balance = balance;
    }


    void deposit(double amount){
        this.balance = balance + amount;
    }

    void withdraw(double amount){
        this.balance = balance - amount;
    }

    void getBalance(){
        System.out.println(balance);
    }
}

