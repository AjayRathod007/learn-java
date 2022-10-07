package dSA;

public class FindNumberOfWaysInMXNmatrix {
	
//	public static void main(String[] args) {
//		int n=4,m=3;
//		int res=countWays(n,m);
//		System.out.println("no.ofways = "+res);
//	}
//
//	private static int countWays(int n, int m) {
//		if(n==1||m==1)
//			return 1;
//		else {
//			return countWays(n,m-1)+countWays(n-1,m);
//		}
//		
//	}
//	
	public static void main(String[] args) {
		int n=3,m=3;
		int totalPath=countPaths(0,0,n,m);
		System.out.println(totalPath);
	}

	private static int countPaths(int i, int j, int n, int m) {
		if(i==n||j==m) {
			return 0;
		}
		if(i==n-1||j==m-1) {
			return 1;
		}
		
		//move downWards
		int downPaths = countPaths(i+1,j,n,m);
		//move right
		int right = countPaths(i,j+1,n,m);
		
		return downPaths+right;
	}

}
