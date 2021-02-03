package com.anne.OOP;

public class UIControl {
    private boolean isEnable = true; // private field are not inherited by sub class (not visible).
    // protected and default field are accessed by all class classes on the same package. (behave as public on same package).
    /*public UIControl() {
        System.out.println("Default UIControl");
    }*/

   /* public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
        System.out.println("Parameterized UIControl constructor");
    }*/

   public void render(){

   }

    public void enable() {
        isEnable = true;
    }


    public void disable() {
        isEnable = false;
    }

    public boolean isEnable(){
        return isEnable;
    }
}
