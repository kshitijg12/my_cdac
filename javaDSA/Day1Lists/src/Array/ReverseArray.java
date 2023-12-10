package Array;

public class ReverseArray {
	public static void swap(int [] arr,int start,int end )
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	
	public static void reverseArray(int [] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}
	
	
	
public static void main(String[] args)

{
	int[] arr = {11,45,96,45,17,64,75,62,14,3,5,48,74,55};
	
    for (int i = 0; i < arr.length; i++) {
    	System.out.print(arr[i]+" ");
		
    }
    reverseArray(arr);
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	
}

}
