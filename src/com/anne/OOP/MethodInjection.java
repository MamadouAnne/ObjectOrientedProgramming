package com.anne.OOP;

public class MethodInjection {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(); // we don't need pass an object of calculator on our report class we pass on the method now
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }
}
