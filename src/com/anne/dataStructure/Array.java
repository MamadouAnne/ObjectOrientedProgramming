package com.anne.dataStructure;

public class Array {
    public int[] items;
    private int count;
    public Array (int length) {
       items = new int[length];
    }

    public void insert(int item){
        //if the array is full resize it
        if (items.length==count){
            //create new array twice the size
            int[] newItems = new int[count*2];
            //copy all the existing items
            for (int i = 0; i<count; i++)
                newItems[i] = items[i];
            //set items to this new array
             items = newItems;
        }
        //add new item at the end of the array
        items[count++] = item;
    }

    public void print(){
        for (int i= 0; i<count; i++)
            System.out.println(items[i]);
    }


}
