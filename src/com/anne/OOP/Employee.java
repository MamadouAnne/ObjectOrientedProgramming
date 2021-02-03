package com.anne.OOP;
// ENCAPSULATION : Binding data and methods in a single unit
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployee;

    public  Employee(int baseSalary){
        this(baseSalary,0);
        /*setBaseSalary(baseSalary);
        setHourlyRate(0);*/
    }
    public  Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public static void printNumberOfEmployee(){
        System.out.println("Number Of Employee: " + numberOfEmployee);
        //new Employee(10000).calculateWage(); // access none static method we have to create an object of Employee
    }

    public int calculateWage(){
        return calculateWage(0);// method overloading
    }

    public int calculateWage(int extraHours){
        System.out.println("Extra Hours: " + extraHours);
        return baseSalary + (hourlyRate*extraHours);
    }

    private int getBaseSalary() { // abstraction used here by putting the method private it cannot be used in main class.
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <=0)
            throw new IllegalArgumentException("Error baseSalary connot be equal to zero or less");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() { //  abstraction is about hiding data or methods
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<0)
            throw new IllegalArgumentException("Error hourlyRate connot be equal to zero or less");
        this.hourlyRate = hourlyRate;
    }
}
