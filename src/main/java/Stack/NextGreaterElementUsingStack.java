package Stack;

import java.util.Stack;

public class NextGreaterElementUsingStack {
	
	public static void nextGreaterElement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		
		for(int i =arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			int temp ;
			if(s.isEmpty()) {
				temp = arr[i];
				arr[i]=-1;
			}else {
				temp = arr[i];
				arr[i]=s.peek();
			}
			s.push(temp);
				
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {3,10,5,1,15,10,7,6};
		nextGreaterElement(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
