package patterns;

public class SideTriangle {
	
	static void pattern(int n)
	{
		int totalCol;
	for (int row = 1; row <= 2*n; row++) {
		if(row>n)
		{
			totalCol = 2*n - row; //when row exceeds mid point no. columns becomes totalRows-current row number.
		}                         // when row becomes mid =5 columns are also 5, but when rows becomes 6 past mid point 
		                          // row becomes 6,columns becomes 5*2-6 = 4
		else                      // row becomes 7,columns becomes 5*2-7 = 3
		{                         // row becomes 8,columns becomes 5*2-8 = 2
		totalCol =  row	;         // row becomes 9,columns becomes 5*2-8 = 1
		 }
		for (int col = 1; col <= totalCol; col++) {
			System.out.print("*");
			}
		System.out.println();
		
	}	
	}
public static void main(String [] args)
{
	pattern(3);
}
}
