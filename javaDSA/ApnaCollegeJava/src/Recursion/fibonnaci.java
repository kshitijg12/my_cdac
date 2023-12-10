package Recursion;

public class fibonnaci {
	
	public static void getFibonnaci(int first,int second,int nTerm)
	{
		if(nTerm == 1)
		{
			
		return ;	
		}
		int third = first+second;
		System.out.println(third);
		
		getFibonnaci(second, third, --nTerm);
		
		
	}
	
	public static void main(String[]args)
	{
		int first= 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		
		int nTerm = 10 ;
		
		getFibonnaci(first,second,nTerm);
				
		
		
	}

}
