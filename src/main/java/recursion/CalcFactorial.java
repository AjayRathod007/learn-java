package recursion;

public class CalcFactorial {
	public static void main(String[] args) {
		int n=5;
		int ans= printFactorial(n);
		System.out.println(ans);
	}
	public static int printFactorial(int n) {
		if(n==1||n==0) {
			return 1;
		}
		
		int f = printFactorial(n-1);
		int fact = n * f;
		return fact;
		
	}

}
