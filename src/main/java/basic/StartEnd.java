package basic;

import java.util.ArrayList;

public class StartEnd {
	 
	public static void main(String[] args) {
		String  s ="  hi ajay how are you  ";
		
		
		 ArrayList<String> arr=wordCounting(s);
		 for(String x: arr)
			  System.out.print(x);
	
	}
	
	/*
	 * public static int spaceCount(String s) {
	 * 
	 * }
	 */
	public static ArrayList<String>  wordCounting(String s) {
		
	    ArrayList<String> ar = new ArrayList<String>();
	     
		int l =s.length();
		int count = 0;
		int i=0;
		String temp ="";
		while(i<l) {
			if(s.charAt(i)!=' ') {
				count++;
				int j=i;
				while(j<l && s.charAt(j)!=' ') {
					temp=temp+s.charAt(j);
					j++;
				}
				ar.add(temp);
				System.out.println(temp);
				temp="";
				
				i=j;
				
			}
				else {
					
					i++;
				}
			
		}
		return ar;
	}
	
	/*public static void reverseEachWord(String s) {
		int ans =wordCounting(s);
		String[] arr = new String[ans];
		for(int i=0;i<`;i++) {
			arr[i]=s.next
		}*/
	}


