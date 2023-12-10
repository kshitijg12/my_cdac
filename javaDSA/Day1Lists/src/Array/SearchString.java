package Array;

import java.util.Iterator;
import java.util.Scanner;

public class SearchString {
	 public static boolean search(String name,char target )
	 {
		 if(name.length() == 0)
		 {
			 return false;
		 }
		 
		 for (int i = 0; i < name.length(); i++) {
			if(target == name.charAt(i))
				return true;
		}
		 return false;
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String name = "KSHITIJ";
		
		System.out.println("Enter char to be searched");
	    char target= 'T';
		
		System.out.println(search(name,target));

	}

}
