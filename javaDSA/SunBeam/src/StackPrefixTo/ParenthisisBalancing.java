package StackPrefixTo;

import java.util.Stack;

public class ParenthisisBalancing {

	public static boolean isBalanced(String expr)
	{   String open = "([{";
	    String close = ")]}";
	    Stack <Character> s = new Stack<Character>();
		//1. trav from left to right
		for(int i = 0; i< expr.length();i++)
		{
		char sym = expr.charAt(i);
		//2. if opening ( found push on stack.
		if(open.indexOf(sym) != -1)
		{
			s.push(sym);
		}
		//3. if closing is found, pop one from stack
		else if(close.indexOf(sym)!= -1)
		{   //pop one from stack 
			//if stack is empty some opening is less
			if(s.isEmpty())
			{
				return false;
			}
			char pop = s.pop();
			//compare if they are matching, if yes, continue.
			if(close.indexOf(sym) != open.indexOf(pop))
			{  //if not matching return false.
				return false;
			}
			
			
			
		}
		//compare if they are matching, if yes, continue.
		//if not matching return false.
		}//end of for loop
		//4.when whole expression is done -, if stack is  empty return true else return false.
		return s.isEmpty(); //if stack isEmpty returns true stack will be empty which means all the parenthesis will be matching
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		System.out.println("Is it balanced "+isBalanced(infix));
	}
}
