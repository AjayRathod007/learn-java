package dSA;

import java.util.Scanner;

public class RemoveDuplicatesInString {
	public static boolean[] map=new boolean[26];
	
	public static void findString(String str,int idx,String ans) {
		if(idx==str.length()) {
			System.out.println(ans);
			return;
		}
		char currChar=str.charAt(idx);
		if(map[currChar-'a']==true) {
			findString(str,idx+1,ans);
		}else {
			ans+=currChar;
			map[currChar-'a']=true;
			findString(str,idx+1,ans);
		}
			
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		String ans="";
		int idx=0;
		findString(str,idx,ans);
	}

}
