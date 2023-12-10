package BinarySearch;

public class OrderAgnosticBinarySearch {
	static int orderBinarySearch(int[] arr, int target) { // Find target element via binary search without knowing if
															// its ascending or descending
		{
			int start = 0;
			int end = arr.length - 1;
			boolean isAsc;

			if (arr[start] < arr[end]) // if first element smaller than last element ascending else descending
			{
				isAsc = true;
			} else {
				isAsc = false;
			}

			while (start <= end) {

				int mid = start + (end - start) / 2; // calculates middle element

				if (target == arr[mid]) // common for both ascending and descending
				{
					return mid;
				}
				if (isAsc) {

					if (target < arr[mid]) // binary search for ascending order
					{
						end = mid - 1;
					} else if (target > arr[mid]) {
						start = mid + 1;
					}
				} else // binary search for descending order
				{
					if (target > arr[mid]) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}

			}
			return 9999;
		}

	}

	public static void main(String[] args) {
		int[] descending = { 88888888, 7777777, 666666, 55555, 4444, 333, 22, 1, 0, -1, -2, -3, -44, -46, -47, -49, -51,
				-60, -70, -80, -81, -85, -89, -91, -100 };
		int[] ascending = { -100, -88, -75, -73, -60, -55, -51, -49, -40, -35, -27, -25, -21, -19, -10, -9, 0, 4, 5, 9,
				11, 16, 19, 21, 26, 27, 28, 30, 44, 55 };
		System.out.println(orderBinarySearch(descending, 0));
		System.out.println(orderBinarySearch(ascending, 0));

	}
}
