package Patterns;

public class SpacesPyramid {

	public static void spacesPyramid(int a )
	{
		for(int i =1 ; i<= a; i++)
		{
			
			for(int j = a; j>=i;j--)
				
			{
				System.out.print(" ");
			
	                                  	}
			for (int j = 1; j<=i; j++) 
			{
				
				System.out.print("* ");
			                           }
			
			System.out.println();
			}
		
	}
	
	public static void main(String[] args) {
   
		spacesPyramid(5);

	}

}
