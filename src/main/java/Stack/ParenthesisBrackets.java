package Stack;

import java.util.Stack;

public class ParenthesisBrackets {
	public static boolean isParenthesisIsMatching(String str) {
		Stack<Character> s = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char curr= str.charAt(i);
			if(isOpening(curr)) {
				s.push(curr);
			}else {
				if(s.isEmpty()) {
					return false;
				}
			else if(!isMatching(s.peek(),curr)) {
				return false;
			}else {
				s.pop();
			}
				
			}
			
		}
		
		return s.isEmpty();
	}
	private static boolean isMatching(char a, char b) {
	
		return (a=='(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
	
	}
	private static boolean isOpening(char curr) {
	
		return curr =='(' || curr =='{' || curr == '['; 
		
	}
	public static void main(String[] args) {
		String str = "()([])";
		System.out.println(isParenthesisIsMatching(str));
		
	}

}
