package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.SortedLinkedList;

class SortedLinkedListTest {
	
	@Test
	void testCount() {
		SortedLinkedList countTest = new SortedLinkedList();
		assertEquals(0,countTest.GetNodeCount());
		countTest.Insert(3);
		countTest.Insert(2);
		countTest.Insert(5);
		countTest.Insert(4);
		assertEquals(4,countTest.GetNodeCount());
		System.out.println(Arrays.toString(countTest.GetAllElements()));
	}

}
