package com.app;

public class DoublyLinkedList {

	private DoublyListNode head;
	private DoublyListNode tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		// Set newNode's previous to empty.
		DoublyListNode newNode = new DoublyListNode(element);

		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		// Set neWNode's next to head
		newNode.next = head;
		// Set head's previous to newNode
		head.prev = newNode;
		// Set head to newNode
		head = newNode;
	}

	public void AddAtRear(int element) {
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

	public int[] GetAllElements() {
		int[] listElements;
		/*
		 * if (head == null) { listElements = new int[0]; return listElements; }
		 */
		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	public void deleteNode(int element) {
		DoublyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// if currrent node's data is element then
			if (curr.data == element) {
				// end the loop - Found the element to be deleted.
				break;
			}
		}

		// if current node is empty then
		if (curr == null) {
			// No node to be deleted as element not found OR list is empty.
			// Stop.
			return;
		}

		// if current node is the first node then
		if (curr == head) {
			// Deleting the first node of linked list
			// Set head to current node's next.
			head = curr.next;

			// if head is empty then
			if (head == null) {
				tail = null;
			} else {
				head.prev = null;
			}
			return;
		}

		if (curr == tail) {
			curr.prev.next = curr.next;
			tail = curr.prev;
			return;
		}

		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;

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
	
	public void insertionSort() {
		DoublyListNode curr=head;
		while(curr!=null)
		{
			
		}
		
		if(curr==null)
			return ;
		
	}

}