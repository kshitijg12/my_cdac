package sorting;

import java.util.Arrays;

public class InsertionSort {

	

public static void insertionStep(int [] arr)
{  System.out.println("Inside insertionStep ");
	int temp =arr[arr.length-1];
	int j ;
	for(j = arr.length-2; j>=0 && arr[j] > temp;j--)
	{
		arr[j+1]=arr[j];
	}
	arr[j+1] = temp;
}

public static void insertionSort(int [] arr)
{
	System.out.println("Inside insertionSort ");
	for(int i = 1;i<arr.length;i++)
	{
		int temp =arr[i];
		int j;
		
		for(j = i-1;j>=0 && arr[j]>temp;j--)
		{
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}
}



public static void main(String[] args)
{
	int [] arr = { 11,22,44,45,63,72,5};
	System.out.println(Arrays.toString(arr));
	System.out.println();
	insertionStep(arr);
	System.out.println();
	System.out.println(Arrays.toString(arr));
	System.out.println();
	int [] array = { 121,22,172,45,11,22,14};
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	insertionSort(array);
	System.out.println();
	System.out.println(Arrays.toString(array));
}

}
