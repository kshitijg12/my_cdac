package Array;

public class FindMin {
	public static int findMin(int [] arr)
	{
		int max = arr[0];
		
		for(int i= 0;i<arr.length;i++)
		{	if(max>arr[i])
				max=arr[i]; }
		return max;
	}
public static void main(String []args) {
	
	int[] arr = {11,45,96,45,17,64,75,62,14,3,5,48,74,17};
	
	for (int i : arr) {
		System.out.print(i+ " ");
	}
	System.out.println("The minimum element is "+findMin(arr));
	
}
}



