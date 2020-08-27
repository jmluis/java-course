package me.chbshoot.ch12;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        setBalance(getBalance() * 1.1);
    }
}