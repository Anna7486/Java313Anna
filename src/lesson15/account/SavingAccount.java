package lesson15.account;

public class SavingAccount implements Account{
    private double balance;
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;  //баланс
        this.interestRate = interestRate;  //процентная ставка
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest(){
        this.balance += this.balance * this.interestRate / 100;
    }
}
