package com.app;

import java.util.Arrays;

public class StackImpl implements IStack {

	private int stack[];
	private int top;

	public StackImpl(int capacity) {
		stack = new int[capacity];
		top = -1;
	}

	@Override
	public void push(int num) {
		if (!isFull()) {
			stack[++top] = num;
			System.out.println(num + " Added to Stack");
		} else
			System.out.println("Stack is Full !!!");
	}

	@Override
	public int pop() {
		if (!isEmpty()) {
			System.out.print("Popped out ");
			return stack[top--];
		}
		System.out.print("Stack is Empty !!! ");
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == stack.length-1;
	}

	@Override
	public String toString() {
		return "Stack : " + Arrays.toString(stack);
	}

}
