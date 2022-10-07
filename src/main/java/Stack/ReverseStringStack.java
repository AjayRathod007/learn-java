package Stack;

import java.util.Stack;

public class ReverseStringStack {
	public static void main(String[] args) {
		String str = "ajay";
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
			
		}
		
		String ans = "";
		
		while(!s.isEmpty()) {
			ans += s.peek();
			s.pop();
		}
		
		System.out.println(ans);
	}

}
