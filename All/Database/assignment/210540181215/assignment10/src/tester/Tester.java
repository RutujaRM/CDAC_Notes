package tester;

import static com.app.BubbleSort.bubbleSort;
import static com.app.LinearSearch.linearSearch;
import static com.app.BinarySearch.binarySearch;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void testSearch() {
		int num[] = { 1, 2, 3, 4, 5 };
		assertFalse(linearSearch(num, 15));
		assertTrue(linearSearch(num, 3));
	}

	@Test
	void testBubbleSort() {
		int num[] = { 5, 4, 3, 2, 1 };
		int sortedArr[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(sortedArr, bubbleSort(num));
	}

	@Test
	void testBinarySearch() {
		int num[] = { 1, 2, 3, 4, 5 };
		assertTrue(binarySearch(num, 5));
		assertFalse(binarySearch(num, 100));
		
	}

}
