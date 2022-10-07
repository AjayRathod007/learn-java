package dSA;

import java.util.Arrays;

public class PermutationUsingRecursion {
	public static void main(String[] args) {
		String str="abc";
		int l=0;
		int r=str.length()-1;
		isPermutation(str,l,r);
		
	}

	private static void isPermutation(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
			
		}else {
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			isPermutation(str,l+1,r);
			str=swap(str,l,i);
			
		}
		
		}
		
		
		
	}

	private static String swap(String str, int l, int i) {
		char [] arr = str.toCharArray();
		char c= arr[i];
		arr[i]=arr[l];
		arr[l]=c;
		
		
		return String.valueOf(arr);
	}

}
