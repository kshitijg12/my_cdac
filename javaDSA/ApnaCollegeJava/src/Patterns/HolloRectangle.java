package Patterns;

public class HolloRectangle {

public static void hollowRectangle(int a , int b)
{
	for(int i =1; i<= a;i++)
	{
		for(int j = 1 ; j<= b ; j++)
		{
			if(i==1 ||j==1 || i ==a || j==b)
			{
				System.out.print("*");
			}
			else {
			System.out.print(" ");}
		}
	    	System.out.println();
	}
	
}
	
public static void main(String[] args)
{
	hollowRectangle(5,5);	
}
}
