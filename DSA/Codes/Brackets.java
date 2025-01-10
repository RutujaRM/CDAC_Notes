package stack;

import java.util.Scanner;

public class Brackets {
	char stack[];
	int tos,maxsize,size;
	public void initStack(int size)
	{
		tos = -1;
		maxsize = size;
		stack = new char[size];
	}
	public boolean isFull()
	{
		if(tos == maxsize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(tos == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(char e)
	{
		tos++;
		stack[tos] = e;
	}
	public void pop()
	{
		tos--; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brackets obj= new Brackets();
		Scanner s = new Scanner(System.in);
		int ch;
		boolean flag = false;
		System.out.println("Enter size");
		int size = s.nextInt();
		obj.initStack(size);
		System.out.println("Enter Expression");
		//s.next();
		String ex = s.next();
		
		for(int i= 0; i < ex.length();i++)
		{
			if(ex.charAt(i) == '{' || ex.charAt(i) == '(' || ex.charAt(i) == '[')
			{
				//System.out.println("jiio");
				if(!obj.isFull())
					obj.push(ex.charAt(i));
			}
			if(ex.charAt(i) == '}' || ex.charAt(i) == ')' || ex.charAt(i) == ']')
			{
				if(!obj.isEmpty())
				{
				obj.pop();
				}
				else
				{
					if(i < ex.length())
					{
						flag = true;
						System.out.println("Unexpected Symbol");
					}
				}
			}
		}
		if(!obj.isEmpty())
		{
			 flag = true;
			System.out.println("Expected Symbol");
		}
		if( flag == false)
		{
			System.out.println("Expression is correct");
		}
	}

}
