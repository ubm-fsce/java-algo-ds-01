package com.uday.datastructures.circularlinkedlist;

public class App {

    public static void main(String args[]) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFirst(100);
        cll.insertLast(200);
        cll.insertLast(300);
        cll.insertFirst(400);
        cll.displayCircularLinkedList();
    }
}
