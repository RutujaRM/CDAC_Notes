package com.app;

public class SortedLinkedList implements ISortedLinkedList {

	private SinglyListNode head;

	public SortedLinkedList() {
		head = null;
	}

	@Override
	public void Insert(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		if (head == null || head.data>newNode.data)
		{
			newNode.next=head;
			head = newNode;
		}
		else {
			SinglyListNode curr = head;
			while (curr.next != null && curr.next.data < newNode.data)
				curr = curr.next;
			newNode.next = curr.next;
			curr.next = newNode;
		}
	}

	@Override
	public int[] GetAllElements() {
		int[] elements;
		elements = new int[GetNodeCount()];
		int i = 0;
		SinglyListNode curr = head;
		while (curr != null) {
			elements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return elements;
	}

	public int GetNodeCount() {
		int count = 0;
		SinglyListNode curr = head;
		while (curr != null) {
			++count;
			curr = curr.next;
		}
		return count;
	}

}
