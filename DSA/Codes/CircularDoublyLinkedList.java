package linkedList;

import java.util.Scanner;

class Cdnode
	{
		Cdnode left;
		int data;
		Cdnode right;
		
		Cdnode(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public class CircularDoublyLinkedList {
		Cdnode root;
		Cdnode last;
		void initList()
		{
			root = null;
			last = null;
		}
		
		void insertLeft(int data)
		{
			Cdnode n = new Cdnode(data);
			if(root == null)
			{
				root = last = n;
				root.right = root;
			}
			else
			{
				n.right = root;
				n.left = last;
				root.left = n;
				 root = n;
				 last.right = root;
			}
		}
		
		void deleteLeft()
		{
			if(root == null)
			{
				System.out.println("LinkedList is empty");
			}
			else if(root == last)
			{
				System.out.println("Deleted Item is "+root.data);
				root = last = null;
			}
			else
			{
				Cdnode t = root;
				root = root.right;
				root.left = last;
				last.right = root;
				System.out.println("Deleted Item is "+t.data);
			}
		}
		
		void insertRight(int data)
		{
			Cdnode n = new Cdnode(data);
			if(root == null)
			{
				root = last = n;
				root.right = root;
			}
			else {
				last.right = n;
				n.left = last;
				last = n;
				last.right = root;
				root.left = last;
			}
		}
		
		void deleteRight()
		{
			if(root == null)
			{
				System.out.println("LinkedList is empty");
			}
			else if(root == last)
			{
				System.out.println("Deleted Item is "+root.data);
				root = last = null;
			}
			else
			{
				Cdnode t = last;
				last = last.left;
				last.right = root;
				root.left = last;
				System.out.println("Deleted Item is "+t.data);
			}	
		}
		void printList()
		{
			if(root == null)
			{
				System.out.println("Linkedlist is empty");
			}
			else
			{
				Cdnode t = root;
				do
				{
					System.out.print(t.data + "  ");
					t = t.right;
				}while(t != root);
			}
		}
		
		void printReverseList()
		{
			if(root == null)
			{
				System.out.println("Linkedlist is empty");
			}
			else
			{
				Cdnode t = last;
				do
				{
					System.out.print(t.data + "  ");
					t = t.left;
				}while(t != last);
			}
		}
		
		public static void main(String args[])
		{
			CircularDoublyLinkedList obj = new CircularDoublyLinkedList();
			int ch, e;
			Scanner s = new Scanner(System.in);
			do
			{
				System.out.println("1.Insert left\n" + "2..Insert Right\n" + "3.Delete left\n" + "4.Delete Right\n"
						+ "5.Print list\n" + "6.Print Reverse List\n" + "8.Exit\n");
				ch = s.nextInt();
				switch (ch) {
				case 1:
					System.out.println("enter element");
					e = s.nextInt();
					obj.insertLeft(e);
					break;

				case 2:
					System.out.println("enter element");
					e = s.nextInt();
					obj.insertRight(e);
					break;

				case 3:
					obj.deleteLeft();
					break;

				case 4:
					obj.deleteRight();
					break;

				case 5:
					obj.printList();
					break;

				case 6:
					obj.printReverseList();
					break;

				case 8:
					System.out.println("bye bye");
					break;

				default:
					System.out.println("Invalid choice");
				}
			}while(ch != 8);
		}
}
//10 2 20 2 30 2 40 2 50 2 60 2 70 2 80
	//10 1 20 1 30 1 40 1 50 1 60 1 70 1 80