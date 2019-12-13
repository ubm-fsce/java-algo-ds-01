package com.uday.datastructures.circularlinkedlist;

public class Node {
    int data;
    Node next;

    public Node() {
        super();
    }

    public Node(int inputData) {
        super();
        this.data = inputData;
    }
	public void displayNode(){
    	System.out.println( this.data);
	}

}
