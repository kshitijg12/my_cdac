package BubbleSort;

import java.util.Iterator;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		boolean swapped;    // swapping does not occur for a particular iteration it means that the array is
							// already sorted
							// as swapping will only occur when first element (j-1) is bigger than the other
							// (j),
		                    // if this never happens it means that all elements are in ascending order, all
	                        // (j-1) elements are smaller than j elements
		int forCounter = 0;
		for (int i = 0; i < arr.length; i++) { // for each iteration max element will come at last index
			swapped = false; // resets the counter after every iteration
			System.out.println("this is for counter " + forCounter++);
			
			for (int j = 1; j < arr.length - i; j++) {
				// swap if element is smaller than previous elements

			if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true; // if this method never runs and changes the value of the swap
				}

			} // inner for
			if (!swapped) // this will break the outer loop
			{
				System.out.println("Array is already sorted");
				break;
			}

		} // outer for
	}

	public static void main(String[] args) {

		int[] arr = { 11, 9, 63, 45, 85, 2, 63, 44, 57, 61, 93, 44, 75, 22, 13, 9, 8, 22, 1 };
		int[] arr1 = { 1, 2, 3, 4, 55 };
		 bubbleSort(arr);
		 for (int i : arr) {
		 System.out.print(i+" ");
		 }
		bubbleSort(arr1);

	}

}
