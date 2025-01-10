package tester;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.SortedDoublyLinkedList;

class SCDLinkedListTest {
	SortedDoublyLinkedList slist;

	@Test
	void testSortedInsertion() {

		slist = new SortedDoublyLinkedList();
		assertEquals(0, slist.GetNodeCount());

		slist.Insert(3);
		slist.Insert(1);
		slist.Insert(6);
		slist.Insert(2);

		int ele[] = slist.GetAllElements();
		assertEquals(4, slist.GetNodeCount());
		System.out.println(Arrays.toString(ele));
		assertEquals(1, ele[0]);
		assertEquals(2, ele[1]);
		assertEquals(3, ele[2]);
		assertEquals(6, ele[3]);

	}
	
	@Test
	public void testSortedDeletion() {
		
		slist = new SortedDoublyLinkedList();

		slist.Insert(3);	//3
		slist.Insert(1);	//1 3
		slist.Insert(6);	//1 3 6
		slist.Insert(2);	//1 2 3 6
		slist.Insert(10);	//1 2 3 6 10
		slist.Delete(6);	//1 2 3 10
		slist.Delete(1);	//2 3 10
		slist.Delete(10);	//2 3
		int ele[] = slist.GetAllElements();
		System.out.println(Arrays.toString(ele));
		assertEquals(2, slist.GetNodeCount());
		assertEquals(2, ele[0]);
		assertEquals(3, ele[1]);
		
	}

}
