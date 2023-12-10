package patterns;

public class HolloRectangle {

	public static void holloRectangle(int a, int b) {
	for(int i=1;i<=a;i++)
	{
		for(int j = 1;j<=b;j++)
		{
			if(i == 1 || j ==1 || i ==a || j == b)
			{
				System.out.print("* ");
			}
			else
				
			{System.out.print("  ");
				
		}
		
	}System.out.println();
}
	}	

public static void main(String []args)
{
	holloRectangle(5, 5);
}
}
