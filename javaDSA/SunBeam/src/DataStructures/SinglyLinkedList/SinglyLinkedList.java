package DataStructures.SinglyLinkedList;

public class SinglyLinkedList {
	
	static class Node{ // creating nested static class allows direct access of private data members
		               //via parent class objects. 
		private int data;
		
		private Node next;
		
		private Node() // called  when adding a node without passing value
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
	
	public SinglyLinkedList() {
		head = null;
	}
	
	// methods
	
	public void display()
	{
		Node trav = head;
		
		while(trav != null) // why? trav != null 
		{
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
	
	public void addFirst(int val)
	{
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;		
	}
	
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null)
		{
			head= newNode;
		}
		else {
		Node trav = head;
		
		while(trav.next!= null) // why? trav.next!= null
		{
			trav = trav.next;
		}
		trav.next=newNode;
		}	
	}
	
	public void addAtPosition(int val, int position)
	{
		Node newNode = new Node(val);
		Node trav= head;
		
		if(trav== null || position <= 1) // if list is empty or position to be added is 1st 
			                             //as it will be impossible to obtain position-1  
		{ addFirst(val);   }

		else {
		for (int i = 1; i < position-1; i++) 
		{
			if(trav.next == null) //if position is beyond last node adds at last node by terminating 
			{ break;            } //loop at last node,since next of last node is null.
			
			trav = trav.next;   
			                     }//end of for loop
		newNode.next = trav.next;
		trav.next = newNode;
		                                       }//end of else block
		                                       }//end of method
	 public void delFirst()
	 {
		 if(head == null) // first node does not exist.
		 {
			 System.out.println("List is empty cannot execute operation");
		 }
		 else
		 {
			 head = head.next;  // 2nd node is made the new head node.
		 }
		                                                              }//end of function
	 public void delAll()
	 {
		 head = null;  //since head is made null entire list marked for GC
	 }
	 
	 public void delPosition(int position)
	 {
		 Node temp= null;
		 Node trav = head;
		 
		 if(trav== null || position < 1) //special case if list empty/position less than 1
		 { System.out.println("Invalid position"); }
		 else if(position == 1) //special case if position is 1st.
		 {
			 delFirst();
		 }
		 else {
		 for (int i = 1; i < position; i++)
		 {
			 temp = trav;                 // temp is walking behind trav,
			 trav = trav.next;    }       // when trav reaches node to be deleted.
		                                  //loop ends and we get temp which is before node to be deleted and trav
		                                  //which is to be deleted
	          temp.next = trav.next;}     //previous node skips node to be deleted and pont s
	                                   
	                                      }//end of method  
	 
	 public void delLast()
	 {
		 Node temp= null;
		 Node trav = head;
		 if(trav== null)
		 {
			 System.out.println("List is empty");
		 }
		 else if(head.next == null)//List only contains 1 element, check if first element next is null and then set 
			                       // head null to delete first element.
		 {
			head = null; 
		 }
		 while(trav.next != null) //trav goes till last node 
		 {
			 temp = trav;         //temp follows trav till last-1 node
			 trav = trav.next;
		 }
		 temp.next=null;          //we set last -1 node as null and last node is marked for GC.
	 }

                                          }//end of class
	 
                                           
	

	


