package basic;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		System.out.println(findFactorial(n));
		
	}
	public static int findFactorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int fact = n;
		while(n>=2) {
			fact = fact*(n-1);
			n--;
		}
		return fact;
	}
}
