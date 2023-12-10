package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int [] arr)
	{System.out.println("Bubble sort: ");
		for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;			}
		}	
		}
		
		
	}
	public static void main(String[] args) {
		
int [] arr = {15,4,9,63,45,12,35,74,66,44};
System.out.println();
System.out.println(Arrays.toString(arr));
bubbleSort(arr);
System.out.println(Arrays.toString(arr));
	}

}
