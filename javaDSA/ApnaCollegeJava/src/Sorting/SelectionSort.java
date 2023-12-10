package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int [] arr)
	{
		for(int i =0;i <arr.length-1;i++)
		{
			int smallest = i;
			
			for(int j= i+1;j<arr.length;j++)
		{
		    if(arr[smallest]>arr[j])
		{
		   smallest= j;	
		}
		}
			int temp = arr[smallest];
			arr[smallest]= arr[i];
			arr[i]=temp;
				
		}
	}
	
	public static void main(String [] args)
	{
		int [] arr= {11,2,44,53,7,8,94,9,3};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
