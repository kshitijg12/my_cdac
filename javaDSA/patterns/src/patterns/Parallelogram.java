package patterns;

import java.util.Iterator;

public class Parallelogram {
	
	static void pattern(int num)
	{   int noSpaces;
		int totalCols;
		for (int row = 0; row < 2*num; row++) {
			
			if(row>num)
			{
			totalCols =	2*num-row;
			}
			else
			{
			totalCols = row;	
			}
			
			noSpaces=num-totalCols;
			
			for (int space = 0; space <noSpaces; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalCols; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)
	{
	pattern(5);	
	}

}
