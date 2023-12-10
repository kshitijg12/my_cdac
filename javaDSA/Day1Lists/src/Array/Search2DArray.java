package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
static int[] search2D(int [][]arr, int target)
{
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(target == arr[i][j]) {
				int [] ans = {i,j};
				return ans;
			}
		}
		
	}
	int [] ans = {-1,-1};
	return new int[]{-1,-1};
	
}
static int findMax2D(int [][]arr)
{
	int max= arr[0][0];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(max < arr[i][j]) {
				max = arr[i][j];
			
			}
		}
		
	}
	return max;
	
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int[][] arr = {{23,14,1},{18,25,6},
				 {45,65,75,25,36,88,22,33 },{78,19,32,101}};
		 
		 System.out.println("Enter no. to be found");
		 int[] arrIndex= search2D(arr, sc.nextInt());
		 System.out.println(Arrays.toString(arrIndex));

		System.out.println("The max element is "+ findMax2D(arr));
		sc.close();
	}

}
