package Recursion;

public class print1_5 {
	
	private static void printAsc(int count,int num) {
		
		if( count > num )
		{
			return ;
		}
		System.out.println(count);
		
		printAsc(++count,num);
		
	}
	
	public static void printDesc(int num)
	{
		if(num < 1)
		{
			return ;
		}
		
		System.out.println(num);
		
		printDesc(num-1);
	}
	
	
	
	public static void main(String [] args)
	{
		printAsc(1,5);
		printDesc(5);
	}



	

}
