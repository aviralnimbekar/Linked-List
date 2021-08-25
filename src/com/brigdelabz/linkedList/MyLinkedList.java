package com.brigdelabz.linkedList;

/**
 * Purpose - Main class
 */
public class MyLinkedList {

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Practice Problem");

        MyNode<Integer> linkedList = new MyNode<>();
//        linkedList.add(70);
//        linkedList.add(30);
//        linkedList.add(56);
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//
//        linkedList.append(56);
//        linkedList.append(70);
//        linkedList.insert(56,30);
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//        linkedList.pop();
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//        linkedList.popLast();
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//        linkedList.search(30);
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(70);
//        linkedList.insert(30, 40);
//
//        linkedList.append(56);
//        linkedList.append(30);
//        linkedList.append(40);
//        linkedList.append(70);
//        System.out.println("Size before removing 40 : " + linkedList.size());
//        linkedList.delete(40);
//        System.out.println("Size after removing 40 : " + linkedList.size());

        linkedList.sortedAdd(56);
        linkedList.sortedAdd(30);
        linkedList.sortedAdd(40);
        linkedList.sortedAdd(70);

        linkedList.toPrint();
    }
}