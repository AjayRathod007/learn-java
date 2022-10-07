package dSA;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int n=5;
		int ans=printFact(n);
		System.out.println(ans);
	}

	private static int printFact(int n) {
		// TODO Auto-generated method stub
		if(n==1||n==0) {
			return 1;
		}
		int fact= n * printFact(n-1);
		return fact;
		
	}

}
