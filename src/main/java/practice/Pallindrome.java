package practice;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		boolean result = isPallindrome(str);
		if(result) {
			System.out.println("pallindrome is:"+result);
		}else
			System.out.println(result);
	}

	private static boolean isPallindrome(String str) {
		// TODO Auto-generated method stub
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)==str.charAt(j)) {
				
			}
			else
				return false;
		}
		return true;
	}

}
