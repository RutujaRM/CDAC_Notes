package tester;

import com.app.CircularQueue;

public class Tester {
	public static void main(String[] args) {
		CircularQueue cQueue=new CircularQueue(5);
		System.out.println(cQueue);
		cQueue.enqueue(2);
		cQueue.enqueue(3);
		cQueue.enqueue(4);
		cQueue.enqueue(5);
		cQueue.enqueue(6);
		cQueue.enqueue(7);
		cQueue.enqueue(28);
		System.out.println(cQueue);
		System.out.println(cQueue.dequeue());
		System.out.println(cQueue.dequeue());
		System.out.println(cQueue);
		cQueue.enqueue(2);
		cQueue.enqueue(6);
		cQueue.enqueue(7);
		cQueue.enqueue(28);
		System.out.println(cQueue);
	}
}
