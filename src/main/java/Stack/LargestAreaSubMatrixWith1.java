package Stack;

import java.util.Stack;

public class LargestAreaSubMatrixWith1 {
	public static void main(String[] args) {
		int[][] a = {{1,1,0,1,1},{1,1,1,1,1},{0,1,1,1,1},{1,1,1,1,1},{1,0,1,1,1},{1,1,1,1,1}};
		System.out.println(largestArea(a));
		
		
	}

	private static int largestArea(int[][] a) {
		// TODO Auto-generated method stub
		int currRow[] = a[0];
		int maxAns = maxHistogram(currRow);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]==1) {
					currRow[j] +=1;
				}else {
					currRow[j]=0;
				}
			}
			
			int currAns = maxHistogram(currRow);
			maxAns = Math.max(maxAns, currAns);
		}
		
		return maxAns;
		
	}

	private static int maxHistogram(int[] currRow) {
		// TODO Auto-generated method stub
		int maxAns = 0;
		int ps[] = prevSmaller(currRow);
		int ns[] = nextSmaller(currRow);
//		for(int x:ps)
//		System.out.print(x+" ");
//		System.out.println();
//		for(int x:ns)
//			System.out.print(x+" ");
//		System.out.println();
		
		for(int i=0;i<currRow.length;i++) {
			int curr = (ns[i] - ps[i] -1) * currRow[i];
			maxAns = Math.max(maxAns, curr);
			
		}
		
		return maxAns;
	
	}

	private static int[] nextSmaller(int[] currRow) {
		// TODO Auto-generated method stub
		int ns[] = new int[currRow.length];
		Stack<Integer> s = new Stack<>();
		for(int i=currRow.length-1;i>=0;i--) {
			while(!s.isEmpty() && currRow[s.peek()]>=currRow[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ns[i]=currRow.length;
			}else {
				ns[i]=s.peek();
			}
			s.push(i);
		}
		return ns;
		
	}

	private static int[] prevSmaller(int[] currRow) {
		// TODO Auto-generated method stub
		int ps[] = new int[currRow.length];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<currRow.length;i++) {
			while(!s.isEmpty() && currRow[s.peek()]>=currRow[i]) {
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
