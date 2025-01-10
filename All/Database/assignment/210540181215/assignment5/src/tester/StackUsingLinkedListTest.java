package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.StackUsingLinkedList;

class StackUsingLinkedListTest {
	
	StackUsingLinkedList stack;
	
	@Test
	void testPush() {
		stack=new StackUsingLinkedList();
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(7);
		int ele[]=stack.GetAllElements();
		System.out.println(Arrays.toString(ele));
	}
	
	@Test
	void testPop() {
		stack=new StackUsingLinkedList();
		stack.pop();
		assertEquals(0,stack.GetNodeCount());
		stack.push(2);
		stack.push(5);
		assertEquals(2,stack.GetNodeCount());
		int ele[]=stack.GetAllElements();
		assertEquals(2,ele[0]);
		assertEquals(5,ele[1]);
		stack.pop();
		assertEquals(1,stack.GetNodeCount());
		stack.pop();
		assertEquals(0,stack.GetNodeCount());
	}

}
