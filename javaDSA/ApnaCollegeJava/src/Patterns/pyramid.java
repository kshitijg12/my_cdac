package Patterns;

public class pyramid {

	public static void pyramidA(int a)
	{
		for(int i = 1; i<=a;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[]args)
	{
		pyramidA(5);
		
	}

}
