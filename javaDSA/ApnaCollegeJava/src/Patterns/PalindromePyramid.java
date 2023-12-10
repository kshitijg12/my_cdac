package Patterns;

public class PalindromePyramid {

public static void palindromePyramid()
{
int a = 5;

for(int i = 1; i<= a; i++)
{
	int p = i; 
	for(int j = a; j>= i;j--)
	{
		System.out.print(" ");
	}
   for(int k =a; k>a-i; k-- )
   {
	  
	System.out.print(p--);   
	
   }
   
   for(int l =2;l<=i;l++)
   {
	   System.out.print(l);
   }
	System.out.println();
}
	
	
}
	
	
	public static void main(String[] args)
	{
		palindromePyramid();
	}
}
