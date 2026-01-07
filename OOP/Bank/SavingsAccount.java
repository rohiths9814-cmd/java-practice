package Bank;

class SavingsAccount extends BankAccount{

    private double minimumBalance = 1000;
    private double interestRate = 0.03;

    SavingsAccount(long accNo , String accName , double balance ){
        super(accNo, accName, balance);
    }

    @Override
    void withdraw(double amount){
        this.balance = balance - amount;
    }

}
