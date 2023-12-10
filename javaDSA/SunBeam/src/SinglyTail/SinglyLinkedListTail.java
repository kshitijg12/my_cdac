package SinglyTail;

//adding tail node pointer. 

public class SinglyLinkedListTail {

	static class Node { // creating nested static class allows direct access of private data members
		// via parent class objects.
		private int data;

		private Node next;

		private Node() // called when adding a node without passing value
		{
			data = 0;
			next = null;
		}

		private Node(int val) // called when creating a node with value
		{
			data = val;
			next = null;
		}

	} // end of Node class

	private Node head;
	private Node tail;

public SinglyLinkedListTail() {
head = null;
tail = null;
}

// methods

	public void display() {
		Node trav = head;

	do // why? trav != null
		{
			System.out.println(trav.data);
			trav = trav.next;
		}while(trav != null);
	}

	public void addFirst(int val) {
		
	
		Node newNode = new Node(val);
		
		if(head == null ) //if list is empty first node becomes last so tail has to point to new node.
		{
			tail = newNode;
		}
		
		newNode.next = head;
		
		head = newNode;
	}

	public void addLast(int val) {
		
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			//add new node to the tail of last node and update tail to newNode
			
			tail.next=newNode;
			tail = newNode;
		}
		
		
		
	/*	else {
			Node trav = head;

			while (trav.next != null) // why? trav.next!= null
			{
				trav = trav.next;
			}
			trav.next = newNode;
			
		}*/
	}

	public void addAtPosition(int val, int position) {
		Node newNode = new Node(val);
		Node trav = head;

		if (trav == null || position <= 1) // if list is empty or position to be added is 1st
		// as it will be impossible to obtain position-1
		{
			addFirst(val);
		}

		else {
			for (int i = 1; i < position - 1; i++) {
				if (trav.next == null) // if position is beyond last node adds at last node by terminating
				{
					break;
				} // loop at last node,since next of last node is null.

				trav = trav.next;
			} // end of for loop
			newNode.next = trav.next;
			trav.next = newNode;
		} // end of else block
	}// end of method

	public void delFirst() {
		if (head == null) // first node does not exist.
		{
			System.out.println("List is empty cannot execute operation");
		} else {
			head = head.next; // 2nd node is made the new head node.
		}
	}// end of function

	public void delAll() {
		head = null; // since head is made null entire list marked for GC
	}

	public void delPosition(int position) {
		Node temp = null;
		Node trav = head;

		if (trav == null || position < 1) // special case if list empty/position less than 1
		{
			System.out.println("Invalid position");
		} else if (position == 1) // special case if position is 1st.
		{
			delFirst();
		} else {
			for (int i = 1; i < position; i++) {
				temp = trav; // temp is walking behind trav,
				trav = trav.next;
			} // when trav reaches node to be deleted.
				// loop ends and we get temp which is before node to be deleted and trav
				// which is to be deleted
			temp.next = trav.next;
		} // previous node skips node to be deleted and pont s

	}// end of method

	public void delLast() {
		Node temp = null;
		Node trav = head;
		if (trav == null) {
			System.out.println("List is empty");
		} else if (head.next == null)// List only contains 1 element, check if first element next is null and then
										// set
		// head null to delete first element.
		{
			head = null;
		}
		while (trav.next != null) // trav goes till last node
		{
			temp = trav; // temp follows trav till last-1 node
			trav = trav.next;
		}
		temp.next = null; // we set last -1 node as null and last node is marked for GC.
	}
	
	public void reverse()
	{
		Node oldHead = head;
		head = null;
		
		while(oldHead != null)
		{
		Node temp = oldHead;
		oldHead = oldHead.next;
		
		temp.next = head;
		head = temp;
			
			
		}
	}
	public Node recReverse(Node h)                                                        
	{
		if(h.next == null) // terminates at last node of LL as lastNode.next == null.
		{
			head = h;      // makes last node as head
			System.out.println("this is head"+h.data);
			return h;             // returns last node as tail in previous call Node tail = recReverse(h.next);
		}
		
		Node tail = recReverse(h.next);
		System.out.println("this is tail "+tail.data);
		System.out.println("This is h "+h.data);
		tail.next = h; // when tail is last node as tail = h.next then h is previous node 
		               // So we are pointing next of last node to its previous node and repeating till h becomes first stack call
		               // Original stack call.
		h.next = null; // when second last node h is added to last node its next is made null as to break its prevous links.
		
	    return h;      // now we return 2nd last node to recReverse(h.next); as tail node and add 3rd last node to its next 
	                   //keep repeating till the first element of the list.
	}

	public void recRapper()
	{
		if(head == null)
		{
			System.out.println("List does not exist");
		}
		else
		{
			recReverse(head);
		}
	}
	
		public void displayRevRecursion(Node h)
		{
			if(h == null)// terminates recursion when h crosses last node and becomes null
			{             
				return ;  // this null is not stored or used 
			}
			
			displayRevRecursion(h.next);
			System.out.println(h.data); //when method is terminated after last node h.next= Last node h == null 
			                            //we get last node as h which is printed and returned to  displayRevRecursion(h.next);
			                            // which then makes its previous node as h and keeps printing while decrementing.
			
		}
		
	public void displayRevRecursionWrapper()
	{
		displayRevRecursion(head);
	}
	
	public int findMid()
	{
		Node slow = head;
		Node fast = head;
		if(head == null)
		{
			System.out.println("List is empty cannot find middle element");
			return 0;
		}
		else
		{
		
		while(fast!= null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		
	}
		return slow.data;}
}// end of class
