package Bank;

public class CurrentAccount extends BankAccount {

    int overdraftLimit;

    CurrentAccount(long accNo , String accName , double balance , int draft){
        super(accNo, accName, balance);
        this.overdraftLimit = draft;
    }

    @Override
    void withdraw(double amount){
        this.balance = balance - amount;
    }

}
