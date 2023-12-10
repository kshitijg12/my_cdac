package Patterns;

import java.util.Scanner;

public class Rhombus {
	
	public static void rhombus(int a )
	{
		
	for(int i = 1; i<=5; i++) {
	for(int j = 5; j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1; k<=a; k++)
	{
		System.out.print("*");
	}
	System.out.println();
	}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter digits");
		rhombus(sc.nextInt());
		sc.close();
	}
	

}
