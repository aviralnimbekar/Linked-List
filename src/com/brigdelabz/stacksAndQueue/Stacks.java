package com.brigdelabz.stacksAndQueue;

import com.brigdelabz.linkedList.MyNode;

public class Stacks {

    public static void main(String[] args) {
        System.out.println("STACKS");

        MyNode<Integer> myStack = new MyNode<>();
        //add = push
        myStack.add(70);
        myStack.add(30);
        myStack.add(56);

        myStack.peak(); //56
        myStack.pop();
        myStack.peak(); //30
        myStack.pop();
        myStack.peak(); //70
        myStack.pop();
        myStack.toPrint();
    }
}
