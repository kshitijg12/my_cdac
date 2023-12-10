package Patterns;

public class invertedPyramid {
	

	public static void pyramid1(int a)
	{
		
		for(int i = a; i>=1;i-- )
		{
			for(int j = 1;j<=i;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void pyramid(int a)
	{
		
		for(int i = 1; i<=a;i++ )
		{
			for(int j = a;j>=i;j-- )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String [] args)
	{
		pyramid(5);
		
		pyramid1(5);
	}

}
