package com.anne.OOP;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // lets create an array of control object and render each object on the console

        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (UIControl control : controls){
            control.render();
        }
    }
}
