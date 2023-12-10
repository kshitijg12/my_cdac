package StackPrefixTo;

import java.util.Stack;

public class ConvertInfixToPost {
	
	public static int priority(char sym)
	{
		switch (sym) {
		case '$': return 10;
		case '*': return 5 ;
		case '/': return 5 ;
		case '%': return 5 ;
		case '+': return 3 ;
		case '-': return 3;
		}
		return 0;
	}
	public static String infixToPrefix(String infix)
	{
		Stack<Character> s = new Stack<Character>();
		StringBuilder prefix = new StringBuilder();
		//traverse infix from right to left
		
		for (int i = infix.length()-1; i >=0 ; i--) 
		{
			char sym = infix.charAt(i);
		//if number/operand is found append to prefix output string	
			if(Character.isDigit(sym))
			{
				prefix.append(sym);
			}
			//if closing ) is found push on stack
			else if(sym == ')')
			{
				s.push(sym);
			}
			
			//if  opening ( is found
			
			else if(sym=='(')
			{
				//pop all operators from stack one by one and append to prefix
				//until closing ) is found
			while(s.peek() != ')')
			{
				prefix.append(s.pop());	
			}
			// also pop and discard closing )
			s.pop();
			}
			else { //if operator +,*,/,- is found push them on stack
				   //if priority of top most operator of stack  >= priority of current operator
				while(!s.isEmpty() && priority(s.peek()) > priority(sym)) // second condition modified
				{
					prefix.append(s.pop());
				}
				s.push(sym);
			}
			
		}// end of for loop
		//when all symbols from infix are done , pop all operators from stack one by one and append to prefix
		while(!s.isEmpty()) // runs till stack is not empty as isEmppty will return false till stack contains elements and will convert 
			                // it to true via ! to keep the while loop running.
		{
			prefix.append(s.pop());
		}
		
		return prefix.reverse().toString(); // reversing the prefix and  converting to String.
	}// end of method prefix
	
public static String infixToPostfix(String infix)
{
	Stack<Character> s = new Stack<Character>();
	StringBuilder postfix = new StringBuilder();
	//traverse infix from left to right
	
	for (int i = 0; i < infix.length(); i++) 
	{
		char sym = infix.charAt(i);
	//if number/operand is found append to postfix output string	
		if(Character.isDigit(sym))
		{
			postfix.append(sym);
		}
		//if opening ( is found push on stack
		else if(sym == '(')
		{
			s.push(sym);
		}
		//if closing ) is found
	
		else if(sym==')')
		{
			//pop all operators from stack one by one and append to postfix
			//until opening ( is found
		while(s.peek() != '(')
		{
			postfix.append(s.pop());	
		}
		// also pop and discard opening (
		s.pop();
		}
		else { //if operator +,*,/,- is found push them on stack
			   //if priority of top most operator of stack  >= priority of current operator
			while(!s.isEmpty() && priority(s.peek()) >= priority(sym))
			{
				postfix.append(s.pop());
			}
			s.push(sym);
		}
		
	}// end of for loop
	//when all symbols from infix are done , pop all operators from stack one by one and append to postfix
	while(!s.isEmpty()) // runs till stack is not empty as isEmppty will return false till stack contains elements and will convert 
		                // it to true via ! to keep the while loop running.
	{
		postfix.append(s.pop());
	}
	
	return postfix.toString(); // converting string builder to string
}// end of method postfix

public static void main(String[] args) {
	String infix = "5+9-4*(8-6/2)+1$(7-3)";
	
	System.out.println(infixToPostfix(infix));
	System.out.println(infixToPrefix(infix));
	
}
}
