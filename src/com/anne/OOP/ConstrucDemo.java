package com.anne.OOP;

public class ConstrucDemo {
    public static void main(String[] args) {
        var textBox = new TextBox(); // this will also call the default constructor of the parent class
        // overriding the toString method

        textBox.setText("Hello World");
        System.out.println(textBox);

    }
}
