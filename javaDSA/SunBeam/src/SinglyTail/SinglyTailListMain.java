package SinglyTail;

import java.util.Scanner;

import DataStructures.SinglyLinkedList.SinglyLinkedList;

public class SinglyTailListMain {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		SinglyLinkedListTail list = new SinglyLinkedListTail ();
		
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("1. To display \n"
					+ "2. To add last \n"
					+ "3. To add first \n"
					+ "4. To add at position \n"
					+ "5. To delete first \n"
					+ "6. To delete last \n"
					+ "7. To delete at certain Position \n"
					+ "8. To delete all.\n"
					+ "9. To reverse list \n"
					+ "10. To reverse list using recursion \n"
					+ "11. To display in reverse using recursion \n"
					+ "12. To find mid of LL using fast and slow pointers");
	
			System.out.println("Enter your choice");	
	
	switch(sc.nextInt())
	{
	case 1: System.out.println("List :");
		list.display();
	break;
	
	case 2: System.out.println("Enter value");
	     list.addLast(sc.nextInt());
	     break;
	     
	case 3: System.out.println("Enter value");
	       list.addFirst(sc.nextInt());
		
		break;
	case 4: System.out.println("Enter value and position");
	        list.addAtPosition(sc.nextInt(),sc.nextInt());
	        break;
	case 5: list.delFirst();
	break;
	case 6: list.delLast();
	break;
	
	case 7: System.out.println("Enter position to delete");
	        list.delPosition(sc.nextInt());
	        break;
	       
	case 8: list.delAll();
	break;
	
	case 9: list.reverse();
	break;
	case 10:
		list.recRapper();
		break;
	case 11: list.displayRevRecursionWrapper();
		break;
		
	case 12 : System.out.println(list.findMid());
	break;
	
	case 0: flag = true;
	
	}
	}
		sc.close();
	}

}
