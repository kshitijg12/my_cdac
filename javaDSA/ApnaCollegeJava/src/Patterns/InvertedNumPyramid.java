package Patterns;

public class InvertedNumPyramid {
	
	public static void invertedNumPyramid(int a)
	{
		for (int i = a; i >=1 ; i--) {
	    for (int j = 1; j <= i; j++) {
	    	System.out.print(j);
			
		}		
	    System.out.println();
		}
	}
	                 //OR
	
	public static void invertedNumPyramid1(int a)
	{
		for (int i = 1; i <=a ; i++) {
	    for (int j = 1; j <= a-i+1; j++) {
	    	System.out.print(j);
			
		}		
	    System.out.println();
		}
	}

	public static void main(String[] args) {
		invertedNumPyramid(5);
		invertedNumPyramid1(5);

	}

}
