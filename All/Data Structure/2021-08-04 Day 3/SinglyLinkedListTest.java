	import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
	@Test
	void testEmptyList() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}
	@Test
	void testAddAtFrontOneElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
}
