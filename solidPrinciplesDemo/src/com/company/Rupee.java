package com.company;

public class Rupee implements MoneyConversion{

    private String currencyDetails;


    public String getCurrencyDetails() {
        return currencyDetails;
    }

    public void setCurrencyDetails(String currencyDetails) {
        this.currencyDetails = currencyDetails;
    }

    @Override
    public  String currency(){
        setCurrencyDetails("₹");
        return getCurrencyDetails();
    }

}
