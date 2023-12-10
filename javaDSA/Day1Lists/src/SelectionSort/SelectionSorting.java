package SelectionSort;

import java.util.Arrays;

public class SelectionSorting {

	static void selectionSort(int [] arr)
	{
	for(int i =0;i<arr.length;i++)
	{
		//find the max item in the array and swap with a44ppropriate position
		int last= arr.length-i-1;
		int maxIndex = getMaxIndex(arr,0,last);
		swap(arr,maxIndex,last);
	}
	}
	
	public static int getMaxIndex(int[] arr, int start, int end) {
		
	int max = start;
	
	for(int i = start; i <= end;i++)	
	{	
	if(arr[max]<arr[i])	
		{
					max = i;		
		}
		
	}
		return max;
	}
	
	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
	   arr[first] = arr[second];
	   arr[second] = temp;
		
	}
	
	

	public static void main(String [] args)
	{
		int [] array = {47,65,78,23,65,99,7,9,1,2,55,44};
	  selectionSort(array);
		System.out.println(Arrays.toString(array));
	
	}
		
	}
	
	

