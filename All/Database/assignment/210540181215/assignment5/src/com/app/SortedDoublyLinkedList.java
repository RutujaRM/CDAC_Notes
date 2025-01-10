package com.app;

public class SortedDoublyLinkedList implements ISortedLinkedList {

	private DoublyListNode head;

	public SortedDoublyLinkedList() {
		head = new DoublyListNode(0);
		head.prev = head;
		head.next = head;
	}

	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		DoublyListNode curr = head.next;
		while (curr.data < newNode.data && curr != head)
			curr = curr.next;
		curr.prev.next = newNode;
		newNode.prev = curr.prev;
		curr.prev = newNode;
		newNode.next = curr;

	}

	@Override
	public void Delete(int element) {
		DoublyListNode curr = head.next;
		while(curr!=head && curr.data!=element)
			curr=curr.next;
		if(curr.data==element)
		{
			curr.next.prev=curr.prev;
			curr.prev.next=curr.next;
		}
	}

	public int[] GetAllElements() {
		int[] elements;
		elements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head.next;
		while (curr != head) {
			elements[i] = curr.data;
			++i;
			curr = curr.next;
		}
		return elements;
	}

	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head.next;
		while (curr != head) {
			++count;
			curr = curr.next;
		}
		return count;
	}

}
