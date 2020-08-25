package me.chbshoot.ch8;

import java.util.Random;

public class TestAccount2 {
    static final Random RANDOM_RANDY = new Random();

    public static void main(String[] args) {
        Account[] arrayOfAccounts = new Account[5];
        String[] names = { "Meredith", "Cristina", "Alex", "Maggie", "Amelia" };
        double[] amounts = new double[5];
        int iter;

        Account.setInterestRate(RANDOM_RANDY.nextDouble());
        for (iter = 0; iter < 5; iter++) {
            amounts[iter] = (double) Math.round(RANDOM_RANDY.nextDouble() * 10000000) / 100;
            arrayOfAccounts[iter] = new Account(names[iter], amounts[iter]);

            System.out.println(arrayOfAccounts[iter].getName() + " has a balance of $" + arrayOfAccounts[iter].getBalance());
            arrayOfAccounts[iter].addInterest();
            System.out.println(arrayOfAccounts[iter].getName() + " has a balance of $" + arrayOfAccounts[iter].getBalance() + " after interest");
            System.out.println("=====================================================================================");
        }

        double safeWithdraw = arrayOfAccounts[0].getBalance() - 20;
        double overdraft = arrayOfAccounts[0].getBalance() + 0.01;
        boolean success;

        System.out.print("[" + names[0] + "] Withdrawing $" + overdraft + "...");
        success = arrayOfAccounts[0].withdraw(overdraft);
        System.out.println(success);

        System.out.print("[" + names[0] + "] Withdrawing $" + safeWithdraw + "...");
        success = arrayOfAccounts[0].withdraw(safeWithdraw);
        System.out.println(success);

        System.out.print("[" + names[0] + "] Withdrawing $" + Account.DEFAULT_WITHDRAWAL + "...");
        success = arrayOfAccounts[0].withdraw();
        System.out.println(success);

        System.out.print("[" + names[0] + "] Withdrawing $" + Account.DEFAULT_WITHDRAWAL + "...");
        success = arrayOfAccounts[0].withdraw();
        System.out.println(success);
    }
}