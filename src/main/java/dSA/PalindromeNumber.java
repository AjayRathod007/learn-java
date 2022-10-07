package dSA;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int res=checkNumberIsPalindrome(n);
		System.out.println(res);
		if(res==n) {
			System.out.println("number is palindrome");
			
		}else
			System.out.println("number is not palindrome");
	}

	private static int checkNumberIsPalindrome(int n) {
		int rev=0;
		System.out.println(n);
		while(n!=0) {
			int rem= n%10;
			rev= rev*10+rem;
			n=n/10;
		}
		// TODO Auto-generated method stub
		return rev;
	}

}
