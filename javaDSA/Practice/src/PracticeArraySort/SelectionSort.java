package PracticeArraySort;

import java.util.Arrays;


public class SelectionSort {

	public static void selectionSort(int [] array)
	{
	for (int i = 0; i < array.length; i++) {
		int end = array.length -1 -i;
		int maxIndex = getMaxIndex(array,0,end);
		
		swap(array,maxIndex,end);
				
	}	
		
		
	}

	private static void swap(int[] array, int maxIndex, int end) {
	int temp = array[maxIndex];
	 array[maxIndex]= array[end];
	 array[end]= temp;
		
	}

	private static int getMaxIndex(int[] array, int start,
			int end) {

		int max = start;

		for (int i = start; i <= end; i++) {

			if (array[max] < array[i]) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] array = {93,21,19};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}






