package tester;

import static com.app.SelectionSort.selectionSort;
import static com.app.InsertionSort.insertionSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.DoublyLinkedList;

public class Tester {

	@Test
	void testSelectionSort() {
		int arr[] = { 5, 4, 3, 2, 1 };
		assertEquals(1, selectionSort(arr)[0]);
		assertEquals(2, selectionSort(arr)[1]);
		assertEquals(3, selectionSort(arr)[2]);
		assertEquals(4, selectionSort(arr)[3]);
		assertEquals(5, selectionSort(arr)[4]);
	}

	@Test
	void testInsertionSort() {
		int arr[] = { 5, 4, 3, 2, 1 };
		assertEquals(1, insertionSort(arr)[0]);
		assertEquals(2, insertionSort(arr)[1]);
		assertEquals(3, insertionSort(arr)[2]);
		assertEquals(4, insertionSort(arr)[3]);
		assertEquals(5, insertionSort(arr)[4]);
	}
	
	@Test
	void testLinkedListInsertionSort() {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.AddAtRear(5);
		dll.AddAtRear(4);
		dll.AddAtRear(3);
		dll.AddAtRear(2);
		dll.AddAtRear(1);
		System.out.println(Arrays.toString(dll.GetAllElements()));
	}

}
