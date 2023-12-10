package InsertionSort;

import java.util.Arrays;

public class InsertionSorting {
	public static void insertionSort(int [] arr)
	{
	for (int i = 0; i < arr.length-1; i++)   // we have to do i<arr.length-1
	{
		for (int j = i+1; j >0 ; j--) 
		{
			if(arr[j]<arr[j-1])
			{	
				swap(arr,j,j-1);
			}
			else
			{     break;                            }
		}		
		}
		}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args)
	{
		int [] arr = {11,24,2,7,63,9,52,7,4,3,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
