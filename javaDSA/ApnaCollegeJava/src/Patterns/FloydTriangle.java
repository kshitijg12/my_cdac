package Patterns;

public class FloydTriangle {
	
	public static void floyd(int a)
	{ int p = 1;
		for(int i = 1 ; i<= a;i++)
		{
			for(int j=1;j<=i ; j++)
			{
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		floyd(5);

	}

}
