package com.app.tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.stack.ArrayStack;

class ArrayStackTest1 {

	@Test
	void testPushUntilFull() {
		ArrayStack stack = new ArrayStack(2);
		stack.push(2);
		stack.push(4);
		assertTrue(stack.isFull());

	}

	@Test
	void testPushPopAndValidateValue() {
		ArrayStack stack = new ArrayStack(2);
		int element = 10;
		stack.push(element);
		assertTrue(stack.pop()== element);

	}

	@Test
	void testIsFull() {
		ArrayStack stack = new ArrayStack(3);
		assertFalse(stack.isFull());

	}

	@Test
	void testForEmptyInitially() {
		ArrayStack stack = new ArrayStack(3);
		assertTrue(stack.isEmpty());
	}

}
