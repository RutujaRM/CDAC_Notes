package com.app;

public class SinglyLinkedList implements ILinkedList {

	private SinglyListNode head;
	private SinglyListNode tail;
	private SinglyListNode prev;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
		listElements = new int[GetNodeCount()];
		int i = 0;
		SinglyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
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

	@Override
	public void deleteNode(int element) {
		SinglyListNode curr = head;

		if (curr == null)
			return;
		while (curr.data != element && curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		if (curr.data == element) {
			prev.next = curr.next;
			curr.next = null;
		}
	}

}
