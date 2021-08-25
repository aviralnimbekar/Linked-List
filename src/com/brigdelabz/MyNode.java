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
            head = newNode;
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
    public void insert(T keyAfter, T newkey) {

        Node<T> prevNode = search(keyAfter);
        if (prevNode != null) {
            Node<T> newNode = new Node<>(newkey);
            Node<T> tempNode;
            tempNode = prevNode.next;
            prevNode.next = newNode;
            newNode.next = tempNode;
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

    /**
     * Purpose - Pop last method to delete last node or TAIL
     */
    public void popLast() {
        Node<T> tempNode = head;
        while (tempNode.next != null) {
            tail = tempNode;
            tempNode = tempNode.next;
        }
        tail.next = null;
    }

    /**
     * Purpose - To search an element from the list
     */
    public Node<T> search(T key) {
        boolean found = false;
        Node<T> tempNode = head;

        while (tempNode != null) {
            if (tempNode.key == key) {
                found = true;
                break;
            } else
                tempNode = tempNode.next;
        }

        if (found)
            System.out.println("LinkedList contains " + key);
        else
            System.out.println("LinkedList dose not contains " + key);

        return tempNode;
    }

    /**
     * Purpose - To delete element from list at random position
     */
    public void delete(T key) {

        Node<T> keyNode = search(key);
        Node<T> tempNode = head, prevNode = null;

        if (head.key == key) {
            pop();
        } else {
            while (tempNode.key != key) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }

            prevNode.next = keyNode.next;
            keyNode.next = null;
        }
    }
}