package com.brigdelabz;

/**
 * Purpose - Creating a single empty node
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
     * Purpose - Printing all nodes
     */
    public void toPrint() {
        Node<T> current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.println(current.key);
                current = current.next;
            }
        }
    }

    /**
     * Purpose - Adding elements to a node
     */
    public void add(T key) {
        Node<T> newNode = new Node<>(key);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node<T> tempNode = this.head;
            this.head = newNode;
            this.head.next = tempNode;
        }
    }

    /**
     * Purpose - Appending elements to a node
     */
    public void append(T key) {
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
     * Purpose - Inserts element between two existing nodes
     */
    public void insert(Node<T> prevNode, Node<T> nextNode, T key) {
        if (prevNode != null && nextNode != null) {
            Node<T> newNode = new Node<>(key);
            prevNode.next = newNode;
            newNode.next = nextNode;
        } else {
            System.out.println("There must be two NODES to insert in between");
        }
    }

    /**
     * Purpose - Pop method to delete first node or HEAD
     */
    public void pop() {
        if (head != null)
            head = head.next;
    }
}


























