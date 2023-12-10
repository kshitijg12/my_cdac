package SinglyCircular;

public class SinglyCircularList {

	static class Node{
		//Node class members
		private int data;
		private Node next;
		
		public Node()
		{
			data = 0;
			next = null;
		}
		
		public Node(int val)
		{
			data = val;
			next = null;
			
		}
                          }//End of node class
	
	//back in SinglyCircularList class
	//SinglyCircularList class members and constructor
	
		private Node head; // no tail required as last node also points to head
		
		public SinglyCircularList()
		{
			head = null;
		}
		
		//start of methods
	
		public boolean isEmpty()
		{
			return head == null;
		}
		
		public void display()
		{
			Node trav = head;
			
		  if (isEmpty())
		  {
			  return;
		                     }
				
		//	while(trav.next != head) // does not work use do while loop,find out why???
			
		  do{                       
			System.out.println(trav.data);
			trav = trav.next;
	        }while(trav!= head);
			                         }// end of display
		
		
		public void addLast(int val)
		{
			Node newNode = new Node(val);
			Node trav = head;
			
			if(isEmpty()) // special case if list is empty
			{
				head = newNode;
				newNode.next = head;
			}
			else {
				
			//traversing till last node whose next contains head.
				
			
			
			newNode.next = head; // new node next made head
           	trav.next= newNode;  // last node next made new node
         
			} //end of else
			}
		
		public void addFirst(int val)
		{
			Node newNode = new Node(val); // create new node and initialize it
			Node trav = head;
			
			if(trav == null)
			{
				head = newNode;
				newNode.next = head;
			}
			else {
			while(trav.next != head)
			{
				trav = trav.next;
			}
			newNode.next = head; //head at the end of list updated 
			trav.next = newNode; // newNode added to last node head a to update head
			
			//update head
			head = newNode; // newNode made 1st node by making it head.
			}
		}
			
			public void addAtPosition(int val, int position)
			{
				if(isEmpty())
				{
					addFirst(val);
				}
				else
				{
				Node newNode = new Node(val);
				Node trav = head;
				
				for(int i = 1; i <position ;i++)
				{
					if(trav.next == head)
					{
						break;//stops loop at last node
					}
					trav = trav.next;
			                                     }
			newNode.next = trav.next ;
			
			trav.next = newNode;
				}	
				
			}
				public void delFirst()
				{
					Node trav = head;
					if(isEmpty())
					{
						System.out.println("List is empty cannot perform operation");
					}
					else if(head.next == head)
					{
						head = null;
					}
					else {
					while(trav.next!= head) //Traveling to end of the list,to get last node
					{
					  trav = trav.next;	
					}
					
					head = head.next; // making second node the new head 
					trav.next = head; // updating last node's next to new head
					}
				}

				public void delAtPosition(int position)
				{
					if(head == null || position <1)
				{
					System.out.println("invalid position , cannot perform operation");
				}
				 if(position == 1) 
                {   delFirst();}
				
				 else {
					 
					 Node temp = null;
					 Node trav = head;
					 
					 for (int i = 1; i < position; i++) { //getting the position node and position -1 node.
						temp = trav;   // position -1 node
						trav = trav.next; // gives position node, loop terminates when reaches position node.
					}
					 
					 temp.next = trav.next; // 
				 }
				 
				 
				}
				
				public void delLast()
				{
					Node temp = null;
					Node trav = head;
					
					if(trav == null)
					{
						System.out.println("List is empty");
					}
					else {
					while(trav.next != head)
					{
						temp =trav;         // ends at second last node 
						trav = trav .next;  // ends at last node 
					}//end of while
					if(temp == null)
					{
						delFirst();
					}else
					{
					temp.next = head;// to delete last node we have to update the secondLast node.next as head.
					}                // to remove link of last node
					}                      
				}
				
				public void deleteAll()
				{
					head.next = null;
					head = null;
				}
				
				
				
			
		}
		
		
		
		
		
	
	

