package com.anne.dataStructure;

import com.anne.dataStructure.Array;

public class ArrayClassDemo {
    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
    }

}
