package com.uday.datastructures.linkedlist;

public class Node {
  int data;
  Node next = null;

  public Node() {
    super();
  }

  public Node(int data) {
    super();
    this.data = data;
  }

  public Node(int data, Node node) {
    super();
    this.data = data;
    this.next = node;
  }

}