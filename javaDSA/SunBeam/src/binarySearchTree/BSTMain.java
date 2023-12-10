package binarySearchTree;

import java.util.Scanner;

public class BSTMain {
  
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		BinarySearchTree bst = new BinarySearchTree();
		
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("Enter 1. To Enter a value. \n"
					+ "2. To Print in Pre-order \n"
					+ "3. To Print in In-Order \n"
					+ "4. To Print in Post- Order\n");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter value to be added in BST");
			bst.addNode(sc.nextInt());
				
				break;
			case 2: System.out.println("Printing Tree in Pre-Order");
			System.out.print("( ");
			bst.displayPreOrder();
			System.out.println(" )");
			break;
			case 3: System.out.println("Displaying Tree in In-Order");
			System.out.print("( ");
			bst.displayInOrder();
			System.out.println(" )");
			break;
			case 4: System.out.println("Displaying Tree in Post-Order");
			System.out.print("( ");
			bst.displayPostOrder();
			System.out.println(" )");
			}
		}
		sc.close();
		
	}
}
