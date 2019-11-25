package com.uday.algo.doublylinkedlist;

public class DoublyLinkedList {
    Node first;
    Node last;

    public boolean isEmpty(){
        return (first ==null) ? true : false;
    }

    public void insertFirst(int ipData){
        Node nNode = new Node(ipData);
        if(isEmpty()){
            last=nNode;
        }else {
            first.previous = nNode;
        }
        first.next = nNode;
        this.first = nNode;
    }
}
