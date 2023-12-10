package StackArray;

import java.util.Scanner;

public class StackArrayMenu {
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	
	Stackk stack = new Stackk(100);
	
	boolean flag = false;
	
	while(!flag)
	{
		System.out.println("1. To push \n"+
			"2.TO pop \n"
			+ "3. To peek \n"
			+ "4. TO find if stack empty \n"
			+ "5. To find if stack is full");
		System.out.println("Enter your choice");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter value to enter stack");
			stack.push(sc.nextInt());
			
			break;


		case 2 : if(stack.pop() == -1)
		{}
		else {System.out.println("The value at top is " + stack.pop());
		}
			break;
			
		case 3: System.out.println(stack.peek());
			
		case 4: System.out.println(stack.isEmpty()?"Stack is empty":"Stack is not empty");
		break;
		
		case 5 : System.out.println(stack.isFull()?"Stack is full":"Stack is not full");
		break;
		
		case 0: flag = true;
		
		break;
		}
		
	}
	sc.close();

}
}
