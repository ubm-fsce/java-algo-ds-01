package com.uday.datastructures.queue;

public class Queue {
  int maxSize; // initialise with max size
  long[] queue;
  int first = -1;
  int last = -1;
  int nItems; // counter to get number of items in Queue

  public Queue(int size) {
    this.maxSize = size;
    this.queue = new long[maxSize];
    this.first = 0;
    this.last = -1;
    this.nItems = 0;
  }

  public void enqueue(long value) {
    last++;
    queue[last] = value;
    nItems++;
  }

  public long dequeue() {
    long temp = queue[first];
    first++;
    if (first == maxSize) {
      first = 0;
    }
    nItems--;
    return temp;
  }

  public long peekFront() {
    return queue[first];
  }

  public boolean isEmpty() {
    return nItems == 0 ? true : false;
  }

  public boolean isFull() {
    return (nItems == maxSize) ? true : false;
  }

  public void printQueue() {
    System.out.print("-----------[ ");
    for (int i = 0; i >= first && i <= last; i++) {
      System.out.print(queue[i] + ", ");
    }
    System.out.println("]---------- ");
  }

  public static void main(String[] args) {
    Queue queue = new Queue(4);
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
