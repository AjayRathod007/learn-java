package Stack;


public class StackUsingArray {
	
	Object[] arr;
	int top;
	int capacity;
	int size;

	public StackUsingArray() {
	}

	public StackUsingArray(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
		size = 0;
		top = -1;
	}

	public void push(Object x) throws Exception  {
		
			if (size == capacity)
				throw new Exception("Oops! Stack is full");
			else {
				size++;
				arr[++top] = x;
			}

	}
	
	public Object pop() throws Exception {
		
		Object t=null;
		
			if (size == 0)
				throw new Exception("Oops! Stack is empty");
			else {
				size--;
				t = arr[top];
				 top--;
			}
			
		return t;
	}

	public Object peek() throws Exception {
		
		Object t=null; 
			if (size == 0)
				throw new Exception("Oops! Stack is empty");
			else 
				t = arr[top];
				
		return t;
	}
	
	
	
	// Main method
	public static void main(String[] arg)
	{
		StackUsingArray s1 = new StackUsingArray(2);
		
		StackUsingArray s2 = new StackUsingArray(1);
		
		try {
			s1.push(1);
			s1.push("gfsdjfgdj");
			System.out.println(s1.pop());
			s1.pop();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	

}
