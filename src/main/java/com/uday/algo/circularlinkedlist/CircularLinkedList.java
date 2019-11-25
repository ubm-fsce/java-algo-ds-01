package com.uday.algo.circularlinkedlist;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		first=null;
		last=null;
	}
	
	public boolean isEmpty() {
		return (first==null) ? true : false;
	}
	public void insertFirst(int ipData) {
		Node newNode = new Node(ipData);
		if(isEmpty())
			last = newNode;
		
		newNode.Next= first;
		first = newNode;
	}
	
	public void insertLast(int ipData) {
		Node newNode = new Node(ipData);
		if(isEmpty()) {
			first=newNode;
		}else {
			last.Next= newNode;
			last = newNode;
		}
		
		
	}
	
}
