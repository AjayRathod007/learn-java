package dSA;

import java.util.Scanner;

public class FirstAndLastOccurenceOfElementInStringUsingRecursion {
	public static int first=-1,last=-1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		System.out.println("enter the element");
		char c=sc.next().charAt(0);
		int idx=0;
		
		findOccurence(str,idx,c);
	}
	private static void findOccurence(String str, int idx, char c) {
		// TODO Auto-generated method stub
		if(idx==str.length()) {
			System.out.println("First = "+first);
			System.out.println("Last = "+last);
			return;
		}
		char currChar=str.charAt(idx);
		if(currChar==c) {
			if(first==-1) {
				first=idx;
			}else {
				last=idx;
			}
		}
		findOccurence(str,idx+1,c);
		
	}


	

	

}
