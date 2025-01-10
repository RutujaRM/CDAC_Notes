package com.app;

public class StackUsingLinkedList implements IStack{

	DoublyListNode head;
	DoublyListNode tail;
	
	public StackUsingLinkedList() {
		head=null;
		tail=null;
	}

	@Override
	public void push(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			while (tail.next != null)
				tail = tail.next;
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public int pop() {
		DoublyListNode curr=tail;
		if(isEmpty())
			return 0;
		if(curr==head)
			head=tail=null;
		else {
			curr.prev.next=null;
			tail=curr.prev;
		}
			
		return curr.data;
	}

	@Override
	public boolean isEmpty() {
		return tail==null;
	}
	
	public int[] GetAllElements() {
		int[] elements;
		elements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;
		while (curr != null) {
			elements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return elements;
	}

	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;
		while (curr != null) {
			++count;
			curr = curr.next;
		}
		return count;
	}
	
}
