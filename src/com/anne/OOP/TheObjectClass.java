package com.anne.OOP;

public class TheObjectClass {
    public static void main(String[] args) {

        var box1 = new TextBox();
        // hashcode is used for comparing object reference
        var box2 = box1;
        var box3 = new TextBox();
        System.out.println("box1: " + box1.hashCode());
        System.out.println("box2: " + box2.hashCode());
        // the equals method is used to comparing object
        System.out.println("box3: " + box3.hashCode());
        System.out.println("is box1 equal to box2: " + box1.equals(box2));
        System.out.println("is box3 equal to box1: " + box3.equals(box1));
        System.out.println(box1.toString()); // hashcode is represented in hexadecimal

    }
}
