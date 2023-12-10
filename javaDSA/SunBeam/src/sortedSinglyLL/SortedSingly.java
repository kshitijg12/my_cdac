package sortedSinglyLL;

public class SortedSingly {

	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	Node head;

	public SortedSingly() {
		head = null;
	}

	public void add(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			return;
		}
		if (newNode.data < head.data) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node trav = head;
		Node temp = head;

		while (trav != null) {

			if (newNode.data < trav.data) {
				temp.next = newNode;
				newNode.next = trav;
				return;
			}
			temp = trav;
			trav = trav.next;

		}
		temp.next = newNode;

	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;

		}
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}

	public void addAll(SortedSingly newList) {
		if (this.head == null) {
			this.head.next = newList.head;
			return;
		}
		Node trav = this.head;

		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newList.head;
		Node temp = new Node();
		for (Node i = this.head; i.next != null; i = i.next) {
			for (Node j = i.next; j != null; j = j.next) {
				if (i.data > j.data) {
					temp.data = i.data;
					i.data = j.data;
					j.data = temp.data;
				}

			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node trav = head;

		while (trav != null) {
			sb.append(trav.data).append(",");
			trav = trav.next;
		}
		return sb.toString().substring(0, sb.length() - 1);

	}

	public void deleteAtPosition(int position) {
		Node trav = head;
		Node temp = head;
		if (position < 1 || head == null) {
			System.out.println("Invalid position");
			return;
		}
		if (position == 1) {
			head = null;
			return;
		}
		for (int i = 1; i < position; i++) {
			if (trav == null) {
				System.out.println("Invalid position");
				return;
			}

			temp = trav;
			trav = trav.next;

		}
		temp.next = trav.next;
	}
	public int getIndex(int val)
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return -1;
		}
		Node trav = head;
		int counter = 0;
		while(trav!= null)
		{
			++counter;
		  	if(val == trav.data)
		  		return counter;
			
			
			trav = trav.next;
			}
		return -1;
	}
	public boolean isSorted()
	{
		Node trav = head;
		Node temp = head;
		while(trav.next != null)
		{
			if(temp.data>trav.data)
				return false;
			
			temp = trav;
			trav = trav.next;
		}
		
		return true;
	}

}
