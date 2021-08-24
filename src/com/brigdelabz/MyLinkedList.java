package com.brigdelabz;

/**
 * Purpose Main class
 */
public class MyLinkedList {

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Practice Problem");

        MyNode<Integer> linkedList = new MyNode<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        linkedList.toPrint();
    }
}