package dSA;

import java.util.Scanner;

public class ReverseStringUSingRECURSION {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.next();
		int idx=str.length()-1;
		findReverseString(str,idx);
	}

	private static void findReverseString(String str,int i) {
		// TODO Auto-generated method stub
	
		if(i==0) {
			System.out.print(str.charAt(i));
			return;
		}
		System.out.print(str.charAt(i));
		findReverseString(str,i-1);
		
	}

}
