package com.app.stack;

import java.util.Arrays;

public class ArrayStack implements IStack {

	private int arr[];
	private int top, size;

	/* Constructor for arrayStack */
	public ArrayStack(int n) {
		this.size = n;
		this.arr = new int[size];
		this.top = -1;
	}

	// method to add an element from the stack
	@Override
	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is Full...!");
		} else
			arr[++top] = element;   //++top; arr[top]=element

	}

	// method to delete an element from the stack
	@Override
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		int element = this.arr[top];
        this.arr[top--] = 0;
        return element;
		
	}

	// method to check stack is full
	@Override
	public boolean isFull() {
		return this.top == this.size-1;
	}

	// method to check stack is empty
	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}

	@Override
	public int getSize() {
		return this.top + 1;
	}

	@Override
	public int getLength() {
		return this.arr.length;
	}

	// method to find peek element
	@Override
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		}
		return arr[top];
	}

	@Override
	public void print() {
		System.out.println(Arrays.toString(this.arr));
	}
}
