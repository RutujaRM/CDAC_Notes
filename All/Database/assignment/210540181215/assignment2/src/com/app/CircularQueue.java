package com.app;

import java.util.Arrays;

public class CircularQueue {

	private int front;
	private int rear;
	private int cQueue[];
	int ele;

	public CircularQueue(int capacity) {
		front = rear = 0;
		cQueue = new int[capacity];
	}

	public void enqueue(int num) {
		if (!isFull()) {
			rear=(rear+1)%cQueue.length;
			cQueue[rear] = num;
			System.out.println(num + " Added to Queue");
		} else
			System.out.println("Queue is full !!!");
	}

	public int dequeue() {
		if (!isEmpty()) {
			front=(front+1)%cQueue.length;
			ele=cQueue[front];
			cQueue[front]=0;
			System.out.print("Popped out ");
			return ele;
		}
		System.out.print("Queue Empty !!!");
		return 0;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return (rear+1)%cQueue.length == front;
	}

	@Override
	public String toString() {
		return "Circular Queue : " + Arrays.toString(cQueue);
	}

}
