//How to find if a given arithmetic expression is a valid one?


import java.util.Scanner;
import java.util.Stack;

//How to find if a given arithmetic expression is a valid one?
public class BalancedBrackets {

	public static String checkBalanceBracket(String s)
	
	{  String isBalanced ;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
			{
				stack.push(s.charAt(i));
				continue;
			}
		
		if(stack.isEmpty())
			return "NO";
		
		else {
			char check = stack.pop();
			
			switch(s.charAt(i))
			{
			case ')':
				if(check=='{'|| check=='[')
					return "NO";
				break;
			case '}':
				if(check=='('|| check=='[')
					return "NO";
				break;
			case ']':
				if(check=='{'|| check=='(')
					return "NO";
				break;
			}
		}
	
			}
		
		isBalanced = (stack.isEmpty()? "YES" :"NO");
		return isBalanced;
		}
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the brackets ");
	String brackets = sc.nextLine();
	
	System.out.println("The brackets are balanced ? " +checkBalanceBracket(brackets));
	
sc.close();
}
		
	}
	

