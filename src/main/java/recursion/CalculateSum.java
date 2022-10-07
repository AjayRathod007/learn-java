package recursion;

public class CalculateSum {
	public static void main(String[] args) {
		printSum(1,5,0);
		
	}
	public static void printSum(int i,int n,int sum) {
		
		if(i==n) {
			sum +=n;
			System.out.println(sum);
			return;
		}
		
		
		
		sum +=i;
		printSum(i+1,n,sum);
	}

}
