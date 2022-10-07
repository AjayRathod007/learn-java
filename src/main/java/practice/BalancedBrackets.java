package practice;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
	
	boolean result=	balanced(str);
		System.out.println("balancedBracketsis:"+result);
	}
	public static boolean balanced(String str) {
		
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isOpening(ch)) {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else if (!isMatching(st.peek(), ch)) {
					return false;

				} else {
					st.pop();
				}
			}
		}

		return st.isEmpty();
	}

	public static boolean isMatching(Character a, char b) {
		// TODO Auto-generated method stub
		return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');

	}

	public static boolean isOpening(char ch) {

		return ch == '(' || ch == '[' || ch == '{';
	}

}
