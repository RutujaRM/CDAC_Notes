package tester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.SinglyListUsingArray;

class SinglyListUsingArrayTest {
	
	@Test
	void testEmptyList() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}
	
	@Test
	void testAddAtFrontOneElement() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	
	@Test
	void testAddAtFrontTwoElement() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}

	@Test
	void testDelete() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
	
		slist.AddAtFront(5);	// 5
		slist.AddAtFront(10);	// 10 5
		slist.AddAtFront(4);	// 4 10 5
		slist.AddAtFront(11);	// 11 4 10 5
		slist.AddAtFront(2);	// 2 11 4 10 5
		slist.Delete(5);		// 2 11 4 10
		slist.Delete(2);		// 11 4 10
		slist.Delete(4);		// 11 10
		int[] listElements = slist.GetAllElements(); // 10, 5
		assertEquals(11, listElements[0]);
		assertEquals(10, listElements[1]);
	}
	
	@Test
	void testAddAtRear() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		
		slist.AddAtRear(5);		// 5
		slist.AddAtRear(10);	// 5 10
		slist.AddAtFront(4);	// 4 5 10
		slist.AddAtFront(11);	// 11 4 5 10
		slist.AddAtFront(2);	// 2 11 4 5 10
		slist.Delete(5);		// 2 11 4 10
		slist.Delete(2);		// 11 4 10
		slist.Delete(4);		// 11 10
		int[] listElements = slist.GetAllElements();
		assertEquals(11, listElements[0]);
		assertEquals(10, listElements[1]);
	}


}


