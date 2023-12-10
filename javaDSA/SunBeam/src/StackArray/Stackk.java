package StackArray;

public class Stackk{
	
	private int[] arr;
	private int top;
	
	public Stackk(int size) {
		arr = new int[size];
		top = - 1;
	}
	
	public void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack is full cannot perform push operation");
		}
		else {
		top++;
		arr[top]= val;
		}
	}
	
	public int pop()
	
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty cannot perform pop operation");
			return -1;
		}
		else {
		System.out.println("Stack is ");
		int temp = arr[top];
		top--;
		return temp;}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty no elements are present in stack");
		}
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == arr.length-1;
	}
	
	
}