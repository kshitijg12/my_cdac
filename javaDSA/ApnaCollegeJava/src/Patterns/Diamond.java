package Patterns;

public class Diamond {

public static void printDiamond()
{
	int a = 5;
	for(int i =1 ; i<=a;i++)  // outer loop for first half
	{
		for(int j = a; j>i;j--)  // inverted spaces for first half . Spaces printed are reduced as j = a = 5 
		{                         // and j>=i which keeps increasing from 1-5.So spaces printed are 5,4,3,2,1.
			System.out.print(" ");
		}
		for(int k = 1; k<= 2*(i)-1;k++) // * s for first half 2*(i)-1 gives 1,3,5,7,9 as i increments from 1-5
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
		for(int i = a; i>=1;i--) // for loop for bottom half
		{
			for(int j = i; j<=a;j++) //for loop for spaces of  second half   since j=i=a=5 for first iteration
			{                        //prints till j<=a=5 so space is printed once. Then j=i=4 as i=a decrements from
				System.out.print(" "); //5,4,3,2,1 .So in next iteration i becomes 4 and runs till 5 printing 2 spaces.
			}                         //so on till spaces becomes 1 till 5 = 5.    
			
			for(int k = 1;k<=2*(i)-1;k++) //now we have to print inverted pyramid,
			{                             //k starts from 1 and goes till 2*(i)-1 
				System.out.print("*");    //since i=a=5, 9 for first iteration k runs till 1-9
				                          //for second i becomes 4,3,2,1 and (2*i)-1 becomes 7,5,3,1 respectively
			}                             // and prints inverted pyramid
			
			
			System.out.println();
		}
	}
	
	
	

	
	 public static void main(String[] args)
	 {
		 printDiamond();
		 
	 }
}
