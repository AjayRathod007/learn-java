package dSA;

public class FibonnaciSeriesUsingRecursion {
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		calcFibonaci(a,b,n-2);
	}

	private static void calcFibonaci(int a, int b, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		int c=a+b;
		System.out.println(c);
		calcFibonaci(b,c,n-1);
	}

}
