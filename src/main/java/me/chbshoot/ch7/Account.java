package me.chbshoot.ch7;

public class Account {
    private double balance;
    private String name;

    public Account(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public void addInterest() {
        balance *= 1.10;
        balance = (double) ((balance * 100) / 100);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}