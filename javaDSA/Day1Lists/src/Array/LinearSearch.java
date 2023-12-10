package Array;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int target) {

		if (arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i])
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11,45,96,45,17,64,75,62,14,3,5,48,74};
		System.out.println("Enter integer to find index");
		int index = linearSearch(arr,sc.nextInt());
		if(index>=0)
			System.out.println("Index of element is "+ index);
		else if(index == -1)
			System.out.println("Element does not exist");
		
		
		sc.close();

	}
}
