package com.uday.datastructures.stack;

public class Stack {
  int stack[];
  int top;

  public Stack() {
    stack = new int[100];
    top = -1;
  }

  void push(int value) {
    stack[++top] = value;

  }

  void pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
    } else {
      top--;
    }

  }

  void printStack() {

    for (int i = 0; i <= top; i++) {
      System.out.println(stack[i]);
    }
  }

  public static void main(String[] args) {

    Stack stack = new Stack();
    stack.push(100);
    stack.push(200);
    stack.push(300);
    stack.push(400);
    stack.printStack();
    stack.pop();
    stack.pop();
    stack.printStack();
  }
}
