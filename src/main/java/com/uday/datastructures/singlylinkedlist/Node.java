package com.uday.algo.singlylinkedlist;

public class Node {
  int data;
  Node next = null;

  public Node() {
    super();
  }

  public Node(int inputData) {
    super();
    this.data = inputData;
  }

  public void displayNodeDeails() {
    System.out.println("Data : " + this.data);
  }
}