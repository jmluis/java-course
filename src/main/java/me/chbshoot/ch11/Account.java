package me.chbshoot.ch11;

public class Account {
    public static final double DEFAULT_WITHDRAWAL = 20.0;

    private static double interestRate;
    private double balance;
    private String name;

    public Account(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public void addInterest() {
        // double bal = getBalance();
        // bal *= (getInterestRate() + 1);
        // bal = (double) ((bal * 100) / 100);
        // setBalance(bal);
     }

    public boolean withdraw() {
        return withdraw(DEFAULT_WITHDRAWAL);
    }

    public boolean withdraw(double amount) {
        if (balance <= 0 || amount <= 0) return false;
        if (amount > balance) return false;

        balance -= amount;
        return true;
    }

    /*
        Getters and setters below
    */

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = (double) ((balance * 100) / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public Account() {
        this("Jose Luis", 50);
    }
}