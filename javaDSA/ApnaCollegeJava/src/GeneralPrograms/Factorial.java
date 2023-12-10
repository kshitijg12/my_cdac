package GeneralPrograms;

public class Factorial {
	
	public static int  factorial(int a )
	{
		int factSum=1;
		for(int i =  a;i>=1 ; i--)
		{
			factSum =  factSum*a;
			a--;
		}
		return factSum;
	}
	
	public static int factRecursion(int a)
	{
		                                           // Write recursion method for Factorial
		if(a<=1)
		{
			return 1;
		}
		
		return a*factRecursion( a-1);
		
	} 
	
	public static void main(String[] args)
	{
		System.out.println(factorial(7));
		
		System.out.println(factRecursion(7));
	}

}
