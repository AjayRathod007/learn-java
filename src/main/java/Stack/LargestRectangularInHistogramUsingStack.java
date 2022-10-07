package Stack;

import java.util.Stack;

public class LargestRectangularInHistogramUsingStack {
	
	public static void main(String[] args) {
		int[] arr = {4,2,1,5,6,3,2,4,2};
		System.out.println(maxArea(arr));
	}

	private static int maxArea(int[] arr) {
		// TODO Auto-generated method stub
		int maxAns = 0;
		int ps[] = prevSmaller(arr);
		int ns[] = nextSmaller(arr);
		for(int x:ps)
		System.out.print(x+" ");
		System.out.println();
		for(int x:ns)
			System.out.print(x+" ");
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			int curr = (ns[i] - ps[i] -1) * arr[i];
			maxAns = Math.max(maxAns, curr);
			
		}
		
		return maxAns;
		
	}
	//4,2,1,5,6,3,2,4,2
	private static int[] nextSmaller(int[] arr) {
		// TODO Auto-generated method stub
		int ns[] = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ns[i]=arr.length;
			}else {
				ns[i]=s.peek();
			}
			s.push(i);
		}
		return ns;
	}

	private static int[] prevSmaller(int[] arr) {
		// TODO Auto-generated method stub
		int ps[] = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ps[i]=-1;
			}else {
				ps[i]=s.peek();
			}
			s.push(i);
		}
		return ps;

	}
	
	
	

}
