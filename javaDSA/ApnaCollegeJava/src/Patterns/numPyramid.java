package Patterns;

public class numPyramid {

	public static void pyramid()
	{
		int a = 5;
		for(int i = 1; i<=a;i++)
		{
			for(int j = a ; j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String [] args)
	{
		pyramid();
		
	}
}
