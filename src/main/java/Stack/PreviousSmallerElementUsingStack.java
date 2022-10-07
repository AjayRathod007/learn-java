package Stack;

import java.util.Stack;

public class PreviousSmallerElementUsingStack {
	
	public static void previousSmallerElement(int [] arr) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && s.peek() >= arr[i]) {
				s.pop();
				
			}
			if(s.isEmpty()) {
				System.out.println("-1");
			}else {
				System.out.println(s.peek());
			}
			
			s.push(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,10,5,1,15,10,7,6};
		previousSmallerElement(arr);
		
	}

}
