package Array;

import java.util.Iterator;

public class TotalOfArray2D {

	public static int  totalUsingFor(int [][]arr) {
		int answer = 0;
		
		for (int person = 0; person < arr.length; person++) {
			int sum = 0;
			for (int account = 0; account < arr[person].length; account++) {
				sum = sum + arr[person][account];
			}
			if(sum>answer)
			{
				answer = sum;
			}
		}
		return answer;
		
	}
	public static int totalOfArray(int[][] bank) {
		
		int answer  = 0;
		for (int[] person : bank) {
			int sum = 0;
			for (int accounts : person) {
				sum = sum + accounts;
				
			}
			if(sum>answer)
			{
				answer = sum;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[][] bank = { { 45, 74, 25, 63, }, { 45, 12, 63, 22, 41, 63, 85 }, { 11, 24, 32, 123 } };
		System.out.println(totalOfArray(bank));
		System.out.println(totalUsingFor(bank));

	}
}
