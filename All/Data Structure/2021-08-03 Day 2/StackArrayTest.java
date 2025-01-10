import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackArrayTest {
	@Test
	void testForEmptyInitially() {
		StackArray stack = new StackArray(3);
		assertTrue(stack.IsEmpty());
	}
	@Test
	void testForFullInitially() {
		StackArray stack = new StackArray(3);
		assertFalse(stack.IsFull());
	}
	@Test
	void testPushUntilFull() {
		StackArray stack = new StackArray(1);
		stack.Push(1);
		assertTrue(stack.IsFull());
	}
	@Test
	void testPushPopAndValidateValue() {
		StackArray stack = new StackArray(1);
		int element = 10;
		stack.Push(element);
		assertTrue(stack.Pop() == element);
	}
}
