package com.anne.OOP;

public class TextBox extends UIControl{

    private   String text = "";  // field or variable

   /* public TextBox() {
        super(true); // will call the parameterized UIConstructor. is required
        System.out.println("TextBox default constructor");
    }*/

    @Override
    public void render() {
        System.out.println("render textBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText (String text){
        this.text = text;
    }

    public  void clear(){
        text = "";
    }
}
