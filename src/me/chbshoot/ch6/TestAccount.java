package me.chbshoot.ch6;

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setName("Jose Luis");
        myAccount.setBalance(3.50);

        System.out.println(myAccount.getName() + " has $" + myAccount.getBalance() + " dollars");

        myAccount.addInterest();
        System.out.println("Added interest!");
        System.out.println(myAccount.getName() + " has $" + myAccount.getBalance() + " dollars");
    }
}