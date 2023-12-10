package DataStructures.SinglyLinkedList;

import java.util.Scanner;

public class SinglyMain {

	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList ();
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
					+ "8. To delete all.\n");
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
	
	case 0: flag = true;
	}
			
		}
		sc.close();
	}
}
