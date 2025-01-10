package tester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.SinglyLinkedList;

class SinglyLinkedListTest {
	SinglyLinkedList slist;

	@Test
	void testEmptyList() {
		slist = new SinglyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		slist = new SinglyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	

	@Test
	void testAddAtFrontTwoElement() {
		slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) && (listElements[0] == element2) && (listElements[1] == element1));
	}

	@Test
	void testAddAtRear() {
		slist = new SinglyLinkedList();
		slist.AddAtRear(2);
		assertEquals(1, slist.GetNodeCount());
		slist.AddAtRear(5);
		assertEquals(2, slist.GetNodeCount());
	}

	@Test
	void deleteNodeTest() {
		slist = new SinglyLinkedList();
		assertEquals(0, slist.GetNodeCount());
		slist.deleteNode(2);
		assertEquals(0, slist.GetNodeCount());
		slist.AddAtRear(2);
		slist.AddAtRear(3);
		slist.AddAtRear(5);
		assertTrue(slist.GetAllElements()[0] == 2 && slist.GetAllElements()[1] == 3 && slist.GetAllElements()[2] == 5);
		slist.deleteNode(3);
		assertTrue(slist.GetAllElements()[0] == 2 && slist.GetAllElements()[1] == 5);
	}

}
