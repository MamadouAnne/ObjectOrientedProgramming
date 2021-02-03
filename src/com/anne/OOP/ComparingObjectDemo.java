package com.anne.OOP;

public class ComparingObjectDemo {
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1.equals(new TextBox()));// we can pass object of TexBox because all classes extends Object
        // it will crash to avoid that we need to make sure the obj is an instance of Point.
        System.out.println(point1==point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}
