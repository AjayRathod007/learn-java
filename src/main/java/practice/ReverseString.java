package practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String ans="";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			char c =str.charAt(i);
			ans=ans+c;
		}
		System.out.println(ans);
	}

}
