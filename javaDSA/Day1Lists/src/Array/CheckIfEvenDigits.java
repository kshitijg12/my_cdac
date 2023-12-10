package Array;

import java.util.Scanner;

public class CheckIfEvenDigits {
	public static boolean ifEvenNoDigits(int digit )
	{ int counter = 0;
		while(digit != 0)
		{
			counter ++;
		digit/=10;	
		}
		return counter % 2 == 0;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check if it has even no. of digits");
		int number = sc.nextInt();
		
		System.out.println(ifEvenNoDigits(number)?number+" has even digits":number+" have odd digits");
			sc.close();	
	}
}
