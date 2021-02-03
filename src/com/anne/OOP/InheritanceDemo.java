package com.anne.OOP;

public class InheritanceDemo {

    public static void main(String[] args) {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnable());
        var textbox = new TextBox();
        textbox.isEnable();
        System.out.println(textbox);
    }
}