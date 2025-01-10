package tester;

import com.app.IQueue;
import com.app.IStack;
import com.app.QueueImpl;
import com.app.StackImpl;

public class Tester {

	public static void main(String[] args) {
		IStack stack = new StackImpl(5);
		IQueue queue = new QueueImpl(5);

		// Stack Operations
		System.out.println(stack);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(14);
		stack.push(13);
		stack.push(123);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("----------------------");
		// Queue Operations
		System.out.println(queue);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(14);
		queue.add(13);
		queue.add(123);
		System.out.println(queue);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue);
	}

}
