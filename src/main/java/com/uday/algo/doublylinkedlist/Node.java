package com.uday.algo.doublylinkedlist;

public class Node {
    private int data;
     Node first;
     Node previous;

    public Node(int inputData){
        super();
        this.data = inputData;
    }

    public void displayNode(){
        System.out.println(this.data);
    }
}
