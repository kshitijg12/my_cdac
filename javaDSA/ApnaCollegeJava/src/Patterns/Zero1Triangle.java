package Patterns;

public class Zero1Triangle {

	public static void zero1(int a)
	{ 
		for(int i = 1 ; i<= a;i++)
		{
			
			for(int j=1;j<=i ; j++)
			{   if((i+j)%2 == 0)
				{
				System.out.print("1 ");
				}
			else
			{
				System.out.print("0 ");
			}
				
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		zero1(5);

	}
}
