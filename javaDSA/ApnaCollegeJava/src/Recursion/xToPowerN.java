package Recursion;

public class xToPowerN {

	public static int power(int x,int n)
	{
		
		System.out.println("x = "+x+"  n = "+n);
		if(x==0)
		{
			return 1 ;
		}
		
		if(n == 1)
		{
			return x;
		}
		
		return x*power(x,--n);
	}
	
	public static int powerEff(int x,int n) 
	{
		System.out.println("x = "+x+"  n = "+n);
		if(x==0)
		{
			return 1 ;
		}
		
		if(n == 1)
		{
			System.out.println("Return 1 called");
			return x;
		}
		
		if(n%2 == 0)
		{  
			System.out.println("even if called");
			int sum =  powerEff(x,n/2)*powerEff(x, n/2);
			System.out.println("sum =" + sum);
			return sum;
		}
		else
		{
			return powerEff(x,n/2)*powerEff(x, n/2)*x;
		}
		
	}
	
	
	
	public static void main(String []args)
	{
	//	System.out.println(power(2,6));
		System.out.println();
		System.out.println(powerEff(2,12));
	//	System.out.println();
	//	System.out.println(power(2,9));
	}
}
