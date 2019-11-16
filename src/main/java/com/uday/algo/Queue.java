package com.uday.algo;

public class Queue {
  int[] queue;
  int first = -1;
  int last = -1;

  public Queue() {
    queue = new int[4];
    first = -1;
    last = -1;
  }

  public void enqueue(int value) {
    if (first == -1) {
      first++;
    }
    queue[++last] = value;
  }

  public void dequeue() {
    for (int i = 0; i < queue.length - 1; i++) {
      queue[i] = queue[i + 1];
    }
  }

  public void printQueue() {
    System.out.println("---------------------");
    for (int i = 0; i < queue.length; i++) {
      System.out.println(queue[i]);
    }
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enqueue(10);
    queue.enqueue(2);
    queue.enqueue(5);
    queue.enqueue(7);
    queue.printQueue();
    System.out.println("DEQUE start");
    queue.dequeue();
    queue.printQueue();
    queue.dequeue();
    queue.printQueue();
    queue.dequeue();
    queue.printQueue();
    queue.dequeue();
    queue.printQueue();

  }

}
