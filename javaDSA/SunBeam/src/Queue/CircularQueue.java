package Queue;

/*Create a queue based on stack
 * 1.push
 * 2.pop
 * 3.peek
 * 4.isFull
 * 5.isEmpty
 * */

public class CircularQueue{
	
	private int [] arr;
	private int front;
	private int rear;
	
	public CircularQueue(int val){
		arr = new int[val];
		front = -1;
		rear = -1;
	}
	
	
	public void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack is full cannot perform push operation");
		}
		else {
		rear++; //increment of rear.
		arr[rear] = val;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty, cannot perform pop operation");
			return -1;
		}
	else {
	int temp = arr[front+1];
	front++; //increment of front
	return temp;
		}
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isFull()
	{
		return rear == arr.length-1;
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
}