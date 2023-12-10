package CircularQueue;

import java.util.Scanner;

public class CircularQueueMain {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of queue");
	
	CircularQueue queue = new CircularQueue(sc.nextInt());
	
	boolean flag = false;
	
	while(!flag)
	{
		System.out.println(" * 1.push\r\n"
				+ "  2.pop\r\n"
				+ "  3.peek\r\n"
				+ "  4.isFull\r\n"
				+ "  5.isEmpty");
		
		System.out.println("Enter your choice");
		
		switch (sc.nextInt()) {
		case 1: System.out.println("Enter value to be entered");
			queue.push(sc.nextInt());
			break;
		case 2: System.out.println("Value of popped element is "+ queue.pop());
		break;

		case 3: System.out.println("Value of peek is "+queue.peek());
		break;
		
		case 4: System.out.println(queue.isFull()?"Queue is full":"Queue is not full");
			break;
		case 5: System.out.println(queue.isEmpty()?"queue is empty":"Queue is not full");
		break;
		
		case 0: flag = true;
		}
	}
	sc.close();
}
}
