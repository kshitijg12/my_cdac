package Recursion;

public class SumOfFirstN {

	public static void getSum(int first,int last,int sum)
	{
		if(first > last)
		{
			System.out.println("Sum ="+ sum);
			return;
		}
		
		sum = sum +first;
		
		getSum(++first, last, sum);
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		getSum(1,9,0);
		
	}
}
