package dSA;

public class SumOfNatunalNumberUsingRecursion {
	public static void main(String[] args) {
		printSum(0,5,0);
	}

	private static void printSum(int i, int n, int sum) {
		// TODO Auto-generated method stub
		if(i==n) {
			sum=+i;
			System.out.println("sum = "+sum);
			return;
		}
		
		sum+=i;
		printSum(i+1,n,sum);
		
	}

}
