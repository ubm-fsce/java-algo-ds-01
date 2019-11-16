package com.uday.algo;

class Node {

  int value;
  Node next;

  public Node(int value) {
    this.value = value;
    this.next = null;
  }
}

public class SinglyLinkedList {
  Node start;

  public void insert(int value) {
    Node current = start;
    while (current.next != null) {
      current = current.next;
    }
    Node newNode = new Node(value);
    current.next = newNode;
  }

  public static void main(String[] args) {
    SinglyLinkedList ll = new SinglyLinkedList();
    ll.start = new Node(5);
    ll.insert(6);
    ll.insert(7);
    ll.insert(8);
    ll.insert(9);
    ll.printList();
    ll.delete(9);
    ll.printList();
    ll.search(22);
  }

  public void printList() {
    Node current = start;
    while (current.next != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  public void delete(int value) {
    if (value == start.value) {
      start = start.next;
      return;
    }
    Node current = start;
    while (current.next.value != value) {
      current = current.next;
    }
    current.next = current.next.next;
  }

  public void search(int value) {
    Node current = start;
    while (current != null) {
      if (current.value == value) {
        System.out.println("value is in linkedlist");
        return;
      }
      current = current.next;
    }
    System.out.println("Value Not Found");

  }

}
