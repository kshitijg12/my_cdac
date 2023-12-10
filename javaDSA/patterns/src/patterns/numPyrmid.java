package patterns;

public class numPyrmid {
	static void pattern(int num)
	{
		for (int row = 1; row <= num; row++) {
			
			for (int space = 0; space < num-row; space++) {
				System.out.print("  ");
				
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col+" ");
			}
			
			for (int col = 2; col <=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
	
public static void main(String [] args) {
	pattern(5);
	
}
}
