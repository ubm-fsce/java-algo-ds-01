package com.uday.algo.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;

	public boolean isEmpty() {
		return (first == null) ? true : false;
	}

	public void insertFirst(int inputData) {
		Node newNode = new Node(inputData);
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int inputData) {
		Node newNode = new Node(inputData);
		Node cNode = first;
		while (cNode.next != null) {
			cNode = cNode.next;
		}
		cNode.next = newNode;
	}

	public Node deleteFirst() {
		Node dNode = first;
		first = dNode.next;
		return dNode;
	}

	public void displaySinglyLinkedList() {
		System.out.println(" :::: BEGIN Printing SLL First --> Last ");
		Node cNode = first;
		while (cNode != null) {
			cNode.displayNodeDeails();
			cNode = cNode.next;
		}
		System.out.println(" Printing SLL First --> Last END :::: ");
	}

}