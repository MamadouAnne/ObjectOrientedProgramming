package com.anne.OOP;

public class TaxReport {
    // he we need to work with class TaxCalculator2018;

    private TaxCalculator calculator;
    // constructor injection
    /* public TaxReport (TaxCalculator calculator){
        this.calculator = calculator;
    }*/

    //Method injection
    public void show (TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    // setter injection
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
