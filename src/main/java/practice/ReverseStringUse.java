package practice;

import java.util.Scanner;

public class ReverseStringUse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		String out = findStr(str);
		System.out.println(out);
	}

	private static String findStr(String str) {
		// TODO Auto-generated method stub
		String ans="";
		int l=str.length();
		int l1=l;
		int i=0;
		
		for( i=l-1;i>=0;i--) {
			
	      System.out.println("fsafsd");
			
			if(str.charAt(i)==' ') {
				
				int s=i;
				//int n=l;
				String ans1 = calFunction(str,s,l1);
				System.out.println(ans1);
				ans=ans+ans1;
				ans+=" ";
				l1=i;
			}
			
		
		}
		ans+=calFunction(str,i,l1);
		return ans;
		
		
	}

	private static String calFunction(String str, int j, int l) {
		// TODO Auto-generated method stub
		String key="";
		for(int i=j+1;i<l;i++) {
			key=key+str.charAt(i);
		}
		//System.out.println(key);
		return key;
	}
		
	}
