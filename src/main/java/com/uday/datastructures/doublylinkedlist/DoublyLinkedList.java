package com.uday.algo.doublylinkedlist;

public class DoublyLinkedList {
  Node first;
  Node last;

  public boolean isEmpty() {
    return (first == null) ? true : false;
  }

  public void insertFirst(int ipData) {
    Node nNode = new Node(ipData);
    if (isEmpty()) {
      last = nNode;
    } else {
      first.previous = nNode;
    }
    first.next = nNode;
    this.first = nNode;
  }

  public void insertLast(int ipData) {
    Node nNode = new Node(ipData);
    if (isEmpty()) {
      first = nNode;
    } else {
      last.next = nNode;
      nNode.previous = last;
    }
    last = nNode;
  }

  public Node deleteFirst() {
    Node tempNode = null;
    if (!isEmpty()) {
      tempNode = first;
      if (first.next == null) {
        last = null;
      } else {
        first.next.previous = null;
      }
      first = first.next;
    }
    return tempNode;
  }

  public Node deleteLast() {
    Node tempNode = null;
    if (!isEmpty()) {
      tempNode = last;
      if (last.previous == null) {
        first = null;
      } else {
        last.previous.next = null;
      }
      last = last.previous;
    }
    return tempNode;
  }


}
