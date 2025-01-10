package tester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.app.DoublyLinkedList;

class DoublyLinkedListTest {
	
	DoublyLinkedList dlist;
	
	@Test
	void testEmptyList() {
		dlist = new DoublyLinkedList();
		int[] listElements = dlist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		dlist = new DoublyLinkedList();
		int element = 5;
		dlist.AddAtFront(element);
		int[] listElements = dlist.GetAllElements();
		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		dlist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		dlist.AddAtFront(element1); // head -> 5
		dlist.AddAtFront(element2); // head -> 10 -> 5
		int[] listElements = dlist.GetAllElements(); // 10, 5
		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	
	@Test
	void testAddAtRear() {
		dlist = new DoublyLinkedList();
		assertEquals(0, dlist.GetNodeCount());
		dlist.AddAtRear(5);
		dlist.AddAtRear(10);
		dlist.AddAtRear(15);
		int list[]=dlist.GetAllElements();
		assertEquals(5, list[0]);
		assertEquals(10, list[1]);
		assertEquals(15, list[2]);
	}
	
	@Test
	void testReverseOfDoublyLinkedList() {
		dlist = new DoublyLinkedList();
		dlist.AddAtRear(5);
		dlist.AddAtRear(10);
		dlist.AddAtRear(15);
		int list[]=dlist.GetAllElementsInReverseOrder();
		assertEquals(15, list[0]);
		assertEquals(10, list[1]);
		assertEquals(5, list[2]);
	}
	
}