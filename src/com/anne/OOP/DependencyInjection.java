package com.anne.OOP;

public class DependencyInjection {
    public static void main(String[] args) {
        // constructor injection
        var calculator = new TaxCalculator2018(100_000);
        //var report = new TaxReport(calculator);
        //report.show(); commented because we are using setter injection

        // setter injection
       // report.setCalculator(new TaxCalculator2019());
       // report.show(); commented because we are using setter injection

    }
}
// commented out because we are using the MethodInjection class