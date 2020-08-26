package me.chbshoot.ch11;

public class TestInheritance {
    public static void main(String[] args) {
        Account[] accts = new Account[3];
        accts[0] = new Account("George W. Bush", 2);
        accts[1] = new SavingsAccount("Donald Trump", 4);
        accts[2] = new CurrentAccount("Barack Obama", 6);

        for (int i = 0; i < accts.length; i++) {
            Account account = accts[i];
            System.out.println(account.getName() + " has a balance of $" + account.getBalance());
            account.addInterest();
            System.out.println(account.getName() + " has a balance of $" + account.getBalance() + " after interest");
            System.out.println("=====================================================================================");
        }
    }
}