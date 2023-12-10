package Array;

public class FindTotalEven {
	
	public static int totalEven(int []arr)
	{
		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
			{even ++;}	
		}
		return even;
	}
	public static int totalOdd(int []arr)
	{
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0)
			{odd ++;}	
		}
		return odd;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {11,45,96,45,17,64,75,62,14,3,5,48,74,17};
		
		System.out.println("Total even elements in the list are "+ totalEven(arr));
		System.out.println("Total odd elements in the list are "+ totalOdd(arr));
	}

}
