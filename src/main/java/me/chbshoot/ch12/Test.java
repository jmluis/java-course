package me.chbshoot.ch12;

public class Test {
    public static void main(String[] args) {
        Detailable[] detailables = new Detailable[6];
        detailables[0] = new SavingsAccount("George W. Bush", 2);
        detailables[1] = new HomeInsurance(500, 10000, 200);
        detailables[2] = new SavingsAccount("Donald Trump", 4);
        detailables[3] = new HomeInsurance(252, 121213, 443);
        detailables[4] = new CurrentAccount("Barack Obama", 6);
        detailables[5] = new HomeInsurance(23441, 45671, 112);

        System.out.println("This is an example of using the Detailable interface to print details");
        for (int i = 0; i < detailables.length; i++) {
            Detailable account = detailables[i];
            System.out.println(account.getDetails());
        }
    }
}