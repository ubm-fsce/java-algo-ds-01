package com.uday.datastructures.doublylinkedlist;

public class Node {
    private int data;
     Node first;
     Node previous;
     Node next;

    public Node(int inputData){
        super();
        this.data = inputData;
    }

    public void displayNode() {
        System.out.println(this.data);
    }
}
