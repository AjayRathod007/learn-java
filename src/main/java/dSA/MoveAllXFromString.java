package dSA;

import java.util.Scanner;

public class MoveAllXFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the string");
		String str=sc.next();
		int idx=0;
		int count=0;
		String ans="";
		findNewString(str,idx,count,ans);

	}

	private static void findNewString(String str, int idx,int count,String ans) {
		// TODO Auto-generated method stub

		if(idx==str.length()-1) {
			for(int i=0;i<count;i++) {
				ans=ans+'x';
			}
			System.out.println(ans);
			return;
		}
		
		char currChar=str.charAt(idx);
		if(currChar=='x') {
			count++;
			findNewString(str,idx+1,count,ans);
			
		}else {
			ans+=currChar;
			findNewString(str,idx+1,count,ans);
		}
		
		
		
	}

}
