package practice;

import java.util.Scanner;

public class RemoveSpecialCharacterFromString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		findString(str);
	}

	private static void findString(String str) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=97&&str.charAt(i)<=122) {
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans);
		
		//String ans = str.replaceAll("[^a-zA-Z0-9]", "");
		
	}

}
