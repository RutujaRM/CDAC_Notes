package tester;

import java.util.Arrays;

import com.app.DoublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.AddAtRear(5);
		dlist.AddAtRear(6);
		System.out.println(Arrays.toString(dlist.GetAllElements()));

	}

}
