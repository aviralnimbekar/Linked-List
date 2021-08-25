package com.brigdelabz.stacksAndQueue;

import com.brigdelabz.linkedList.MyNode;

public class Queue {

    public static void main(String[] args) {
        System.out.println("QUEUES");

        MyNode<Integer> myQueue = new MyNode<>();

        myQueue.append(56);
        myQueue.append(30);
        myQueue.append(70);

        myQueue.peak(); //56
        myQueue.pop();
        myQueue.peak(); //30
        myQueue.pop();
        myQueue.peak(); //70
        myQueue.pop();
        myQueue.toPrint();

    }
}