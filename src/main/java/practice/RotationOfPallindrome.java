package practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfPallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		System.out.println("palindrom possiblr " + isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		int l=str.length();
		char [] arr=str.toCharArray();
		int c=0;
		
		
		while(c < l){
        
			
        String check= "";
        for(char x : arr)
        	check+=x;
        
	    	System.out.println(check);
			
		boolean flag=isPalindromeString(check);
		if(flag)
			return true;
			
		char t = arr[0];
		int j=0;
	    for(j=1;j<arr.length; j++) 
		    arr[j-1]=arr[j];
				   
			arr[j-1] = t;
				
			c++;	  
	}
			
		
		
		return false;

	}

	private static boolean isPalindromeString(String check) {
		for(int i=0,j=check.length()-1;i<j;i++,j--) {
			if(check.charAt(i)==check.charAt(j)) {
				
			}
			else
				return false;
		}
		return true;
		
	}

}
