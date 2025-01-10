package com.app;

public class SinglyListUsingArray implements ILinkedList {
	private class Node {
		int data;
		int next;

		public Node() {
			data = 0;
			next = -2;
		}
	}

	Node[] dataArea; // Where memory for nodes will be allocated.
	int head;
	int tail=-1;

	public SinglyListUsingArray(int size) {
		dataArea = new Node[size];
		for (int i = 0; i < size; ++i) {
			dataArea[i] = new Node();
		}
		tail = -1;
		head = -1;
	}

	int GetNewElement() {
		for (int i = 0; i < dataArea.length; ++i) {
			if (dataArea[i].next == -2) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode
		int newNode = GetNewElement();

		// Store element in newNode's data
		dataArea[newNode].data = element;

		// Set newNode's next to head
		dataArea[newNode].next = head;

		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		int newNode = GetNewElement();
		
		dataArea[newNode].data = element;
		dataArea[newNode].next = -1;
		if (head == -1) {
			head = newNode;
			tail = newNode;
		} else
			dataArea[tail].next = newNode;
//		int prev=-1;
//		while(dataArea[curr].next!=-1)
//		{
//			prev=curr;
//			curr++;
//		}
//		dataArea[newNode].data = element;
//		dataArea[newNode].next = -1;

	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;

		listElements = new int[GetNodeCount()];
		int i = 0;
		// Set current to fist node of list.
		int curr = head;

		// while (current is not empty) do
		while (curr != -1) {
			// Process current node.
			listElements[i] = dataArea[curr].data;
			++i;

			// Set current to current node's next.
			curr = dataArea[curr].next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		int curr = head;
		int prev = -1;
		while (curr != -1 && dataArea[curr].data != element) {
			prev = curr;
			curr = dataArea[curr].next;
		}
		if (curr == -1)
			return;
		if (curr == head) {
			head = dataArea[curr].next;
			return;
		}
		dataArea[prev].next = dataArea[curr].next;
	}

	public int GetNodeCount() {
		int count = 0;
		// Set current to fist node of list.
		int curr = head;

		// while (current is not empty) do
		while (curr != -1) {
			// Process current node.
			++count;

			// Set current to current node's next.
			curr = dataArea[curr].next;
		}

		return count;
	}
}
