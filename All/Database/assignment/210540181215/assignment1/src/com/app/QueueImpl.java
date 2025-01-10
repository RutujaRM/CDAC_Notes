package com.app;

import java.util.Arrays;

public class QueueImpl implements IQueue {

	private int front;
	private int rear;
	private int queue[];

	public QueueImpl(int capacity) {
		front = rear = -1;
		queue = new int[capacity];
	}

	@Override
	public void add(int num) {
		if (!isFull()) {
			queue[++rear] = num;
			System.out.println(num + " Added to Queue");
		} else
			System.out.println("Queue is full !!!");
	}

	@Override
	public int delete() {
		if (!isEmpty()) {
			System.out.print("Popped out ");
			return queue[++front];
		}
		System.out.print("Queue Empty !!!");
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return rear == front;
	}

	@Override
	public boolean isFull() {
		return rear == queue.length - 1;
	}

	@Override
	public String toString() {
		return "Queue : " + Arrays.toString(queue);
	}

}
