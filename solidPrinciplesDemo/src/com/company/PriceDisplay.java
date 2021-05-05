package com.company;

public class PriceDisplay {

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private String currency;

    public  String conversion(MoneyConversion moneyConversion){
       setCurrency(moneyConversion.currency());
        return getCurrency();
    }


}
