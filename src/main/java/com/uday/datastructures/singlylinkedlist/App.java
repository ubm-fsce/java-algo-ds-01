package com.uday.datastructures.singlylinkedlist;

public class App {
  public static void main(String args[]) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.insertFirst(100);
    sll.insertFirst(200);
    sll.insertFirst(477);
    sll.insertLast(999);
    sll.displaySinglyLinkedList();
  }
}