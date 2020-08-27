package me.chbshoot.ch12;

public class HomeInsurance implements Detailable {
    double premium;
    double excess;
    double amountInsured;

    public HomeInsurance(double premium, double excess, double amountInsured) {
        super();

        this.premium = premium;
        this.excess = excess;
        this.amountInsured = amountInsured;
    }

    @Override
    public String getDetails() {
        return "[" + amountInsured + "]" + premium + " " + excess;
    }
    
}