package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
	ArrayList<Object> arr;
	int top;
	

	public StackUsingArrayList() {
		
		arr = new ArrayList<Object>();
		top = -1;
	}
	

	public void push(Object x) {
		
				arr.add(x);
				top++;
			}
	
	public Object pop() {
		
		Object t=null;
		t = arr.remove(top);
		top--;
		
		return t;
	}

	public Object peek()  {
			
		return arr.get(top);
		
	}
	
	
	public int size()  {
		
		return arr.size();
		
	}
	
public void print()  {
		
		System.out.println(arr);
		
	}
	
	
	
	
	// Main method
	public static void main(String[] arg) throws Exception
	{
		StackUsingArrayList s1 = new StackUsingArrayList();
		
		try
		{
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push("asdasas");
			//System.out.println(s1.peek());
			//s1.pop();
			
			s1.print();
			s1.pop();
			s1.print();
			System.out.println(s1.size());
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}


}
