package me.chbshoot.ch7;

import java.util.Random;

public class TestAccount {
    static final Random RANDOM_RANDY = new Random();

    public static void main(String[] args) {
        Account[] arrayOfAccounts = new Account[5];
        String[] names = { "Meredith", "Cristina", "Alex", "Maggie", "Amelia" };
        double[] amounts = new double[5];
        int iter;

        for (iter = 0; iter < 5; iter++) {
            amounts[iter] = (double) Math.round(RANDOM_RANDY.nextDouble() * 10000000) / 100;
            
            
            arrayOfAccounts[iter] = new Account(names[iter], amounts[iter]);
            System.out.println(arrayOfAccounts[iter].getName() + " has a balance of $" + arrayOfAccounts[iter].getBalance());
            System.out.println("=====================================================================================");
            arrayOfAccounts[iter].addInterest();
            System.out.println(arrayOfAccounts[iter].getName() + " has a balance of $" + arrayOfAccounts[iter].getBalance() + " after interest");
            System.out.println("=====================================================================================");
        }
    }
}