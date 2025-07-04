package entities;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;
    private double totalDeposits;

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.totalDeposits = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        totalDeposits += amount;
        balance += amount;
        return balance;
    }

    public void withdraw(double amount) {
        double tax = 5.0;
        double totalWithdraw = amount + tax;
       balance -= totalWithdraw;
    }
}