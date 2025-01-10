package com.app.stack;


public interface IStack {
	
    public void push(int i);  
    public int pop();
    public boolean isFull();
    public boolean isEmpty();
    //==============================
    public int getSize();
    public int getLength();
    public int peek();
    public void print();



}
