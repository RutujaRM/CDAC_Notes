package com.app.tester;

import java.util.Scanner;

import com.app.stack.*;

public class ArrayStackTest2 {
	static int choice = 0;

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter size of stack : ");
			IStack stack = new ArrayStack(scan.nextInt());
			while (choice != 9) {
				System.out.println("Stack Operation");
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Check if empty");
				System.out.println("4. Check if full");
				System.out.println("5. Check size [elements count]");
				System.out.println("6. Check length");
				System.out.println("7. Peek/top element in stack");
				System.out.println("8. Print stack");
				System.out.println("9. Quit");
				System.out.print("Make your choice : ");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter a number : ");
					stack.push(scan.nextInt());
					break;
				case 2:
					System.out.println("Element popped : " + stack.pop());
					break;
				case 3:
					System.out.println("Is stack empty ? " + stack.isEmpty());
					break;
				case 4:
					System.out.println("Is stack full ? " + stack.isFull());
					break;
				case 5:
					System.out.println("Total elements in stack : " + stack.getSize());
					break;
				case 6:
					System.out.println("Total size in stack : " + stack.getLength());
					break;
				case 7:
					System.out.println("Element on top : " + stack.peek());
					break;
				case 8:
					stack.print();
					break;
				case 9:
					System.out.println("Good Bye :)");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}

		}
		
	}
}
