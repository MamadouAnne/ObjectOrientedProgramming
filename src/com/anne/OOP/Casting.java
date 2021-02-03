package com.anne.OOP;

public class Casting {
    public static void main(String[] args) {
        var control = new UIControl();
        show(control); // will print a toString method of control
        var textBox = new TextBox();
        show(textBox); // every textBox is a control because TexBox extends UIControl (This is Up casting)
                      // this method will return nothing because we overrode the toString method in TexBox
                      // to fix the problem
    }

    public static void show(UIControl control){
        // at compile time we don't have access to any method of the TexBox class we need to cast it with TextBox.
        if (control instanceof TextBox) { // condition will fix the exception problem
            var textBox = (TextBox) control; // down casting ( UIControl cannot be cast to TextBox by the way)
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
