package com.anne.OOP;

public class Main {

    public static void main(String[] args) {
        // this demo covered encapsulation , abstraction, constructor overloading and method overloading
        var employee1 = new Employee(10_000);
        var employee2 = new Employee(50_000, 20);
        int wage1 = employee1.calculateWage();
        System.out.println("Wage1: " + wage1);
        int wage2 =employee2.calculateWage(10);
        System.out.println("Wage2: " + wage2);
        Employee.printNumberOfEmployee(); // static method
        //System.out.println("Number Of Employee: " + Employee.numberOfEmployee); // Static filed





        /*// write your code here

        var textBox1 = new TextBox();
        textBox1.setText("Box 2");
        System.out.println(textBox1.text);*/
    }
}
