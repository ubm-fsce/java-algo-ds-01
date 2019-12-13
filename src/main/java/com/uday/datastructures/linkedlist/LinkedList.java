package com.uday.datastructures.linkedlist;

public class LinkedList {
  public static void main(String[] args) {
    Node nodeA = new Node(3);
    Node nodeB = new Node(3);
    Node nodeC = new Node(7);
    Node nodeD = new Node(8);
    nodeA.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;

    System.out.println("Linked List Length: " + listLength(nodeA));
    System.out.println("Linked List Length: " + listLength(nodeD));
  }

  public static int listLength(Node node) {
    int length = 0;
    Node currentNode = node;
    while (currentNode.next != null) {
      length++;
      currentNode = currentNode.next;
    }
    return length;
  }

}