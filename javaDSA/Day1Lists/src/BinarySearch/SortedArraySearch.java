package BinarySearch;

public class SortedArraySearch {
	static int binarySearch(int[]arr,int target)
	{
		int start=0;
		int end = arr.length-1;
		while(start<=end)
		{
		//	int  mid = (start+end)/2;
			int mid = start + (end-start)/2 ;
			
			if(target<arr[mid])
			{
				end = mid-1;
			}
			else if(target>arr[mid])
			{
				start = mid+1;
			}
			else if(target == arr[mid])
			{
				return mid;
			}	
		}
	return 9999;	
	}
public static void main(String[] args)
{
	int [] array = {1,2,3,4,11,12,15,17,19,22,26,35,37,42,46,48,49,51,53,56,57,75};
	System.out.println(binarySearch(array, 27));
}
}
