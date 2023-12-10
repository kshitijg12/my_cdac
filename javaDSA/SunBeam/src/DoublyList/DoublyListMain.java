package DoublyList;

import java.util.Scanner;

import SinglyCircular.SinglyCircularList;

public class DoublyListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyList list = new DoublyList();
		list.addLast(10);
		list.addLast(20);
		list.addFirst(30);

		boolean flag = false;

		while (!flag) {
			System.out.println(
					"1. To display \n" + "2 To. display reverse \n" + "3. To add last \n" + "4. To add first \n"
							+ "5. To add at position \n" + "6. To delete first \n" + "7. To delete last \n"
							+ "8. To delete at certain Position \n" + "9. To delete all.\n" + "10. Reverse list \n"
									+ "11. Sort List \n"
									+ "12. Find middle element");

			System.out.println("Enter your choice");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("List :");
				System.out.print("( ");
				list.displayForward();
				System.out.println(" )");
				break;

			case 2:
				System.out.print("( ");
				list.displayRev();
				System.out.println(" )");
				break;
			case 3:
				System.out.println("Enter value");
				list.addLast(sc.nextInt());
				break;

			case 4:
				System.out.println("Enter value");

				list.addFirst(sc.nextInt());

				break;

			case 5:
				System.out.println("Enter position and value");
				list.addAtPosition(sc.nextInt(), sc.nextInt());
				break;

			case 6:
				list.deleteFirst();
				break;

			case 7:
				list.deleteLast();
				break;

			case 8:
				System.out.println("Enter position to delete");
				list.deleteAtPosition(sc.nextInt());
				break;

			/*
			 * case 9: list.deleteAll(); break;
			 */
			case 10:
				list.reverseList();
				break;

			case 11:
				list.sortList();
				break;

			case 12: System.out.println("Value at middle node is :"+ list.findMiddle());
			break;
			case 0:
				flag = true;

				break;
			}
		}
		sc.close();
	}
}
