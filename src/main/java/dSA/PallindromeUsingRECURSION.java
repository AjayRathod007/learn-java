package dSA;

import java.util.Scanner;

public class PallindromeUsingRECURSION {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.next();
		int l=str.length();
		int left=0;
		int right=l-1;
		boolean flag = isPallindrome(str,left,right);
		if(flag==true)
			System.out.println("yess pallindrome");
		else
			System.out.println("no pallindrome");
	}

	private static boolean isPallindrome(String str, int left, int right) {
		if(left >= right) {
			return true;
		}
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		
			return(isPallindrome(str,left+1,right-1));
		
		
	}

}
