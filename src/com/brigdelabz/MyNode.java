package com.brigdelabz;

/**
 * Purpose - Creating a single node
 */
class Node<T> {
    T key;
    Node<T> next;

    Node(T key) {
        this.key = key;
        this.next = null;
    }
}

/**
 * Purpose - Manipulating Linked list
 */
class MyNode<T> {

    Node<T> head;
    Node<T> tail;

    /**
     * Purpose - Adding value(KEY) and next to a node
     */
    public void add(T key) {
        Node<T> newNode = new Node<>(key);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Purpose - Printing all nodes
     */
    public void toPrint() {
        Node<T> current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.println(current.key + " ");
                current = current.next;
            }
        }
    }
}
