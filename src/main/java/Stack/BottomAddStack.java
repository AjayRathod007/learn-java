package Stack;

import java.util.Stack;

public class BottomAddStack {
	
	public static void pushBottom(Stack<Integer> s, int x)
	{
	    
		if(s.isEmpty())
		{
			s.push(x);
			return;
		}
		
		int temp = s.pop();
		
		pushBottom(s,x);
		s.push(temp);
		
	}
	
	public static void main(String []arg)
	{
		
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		pushBottom(s, 8);
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
