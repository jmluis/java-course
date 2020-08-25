package me.chbshoot.ch6;

public class Account {
    private double balance;
    private String name;

    public Account() {
        
    }

    public void addInterest() {
        balance *= 1.10;
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