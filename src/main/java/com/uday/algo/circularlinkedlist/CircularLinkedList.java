package com.uday.algo.circularlinkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {

        return (first == null) ? true : false;
    }

    public void insertFirst(int ipData) {
        Node newNode = new Node(ipData);
        if (isEmpty())
            last = newNode;

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int ipData) {
        Node newNode = new Node(ipData);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null)
            last = null;

        first = first.next;
        return temp;
    }

    public void displayCircularLinkedList() {
        Node cNode = first;
        System.out.println("<=== | begin Printing first -->  last ");
        while (cNode!= null) {
            cNode.displayNode();
            cNode = cNode.next;
        }
		System.out.println(" End Printing first -->  last | ==>");
    }

}
