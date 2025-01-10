package tester;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.app.CircularQueue;

class TestCases {

	@Test
	void isEmpty() {
		CircularQueue forEmpty = new CircularQueue(3);
		assertTrue(forEmpty.isEmpty());
		forEmpty.enqueue(1);
		assertFalse(forEmpty.isEmpty());
		forEmpty.enqueue(2);
		assertFalse(forEmpty.isEmpty());
	}

	@Test
	void isFull() {
		CircularQueue forFull = new CircularQueue(3);
		assertFalse(forFull.isFull());
		forFull.enqueue(1);
		assertFalse(forFull.isFull());
		forFull.enqueue(2);
		assertTrue(forFull.isFull());
	}

}
