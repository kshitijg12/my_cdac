package Array;
public class FindTotalEvenDigits2D {
	
	static int findNumber(int [] nums)
	{
		int count =0;
	for (int i = 0; i < nums.length; i++) {
		if(even(nums[i]))
		{
			count++;
		}
	}
	return count;
	}

	private static boolean even(int number) {
		if(number <0)
		{
			number = number* -1;
		}
		int count = 0;
		while(number != 0)
		{
			count++;
		number/=10;	
		}
		return count % 2 == 0; 
	}

	public static void main(String[] args) {
	
		int [] arr = {11,4,45,85,66,75,41,456,753,951,-4582,4563};
		
		System.out.println("Total no. even  of elements are "+findNumber(arr));

	}

}
