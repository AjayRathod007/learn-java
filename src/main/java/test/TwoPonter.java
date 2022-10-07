package test;

import java.util.HashSet;

public class TwoPonter {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 3, 5, 8 };
		int x=10;
		//countPair(arr1,arr2,x);
		usingHashSet(arr1,arr2,x);
	}

	private static void usingHashSet(int[] arr1, int[] arr2, int x) {
		int m=arr1.length;
		int n=arr2.length;
		int count =0; 
		HashSet<Integer> cd = new HashSet<>();
		for(int i=0;i<m;i++) {
			cd.add(arr1[i]);
		}
		
		for(int j=0;j<n;j++) {
			if(cd.contains(x-arr2[j])) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	private static void countPair(int[] arr1, int[] arr2, int x) {
		// TODO Auto-generated method stub
		int n=arr1.length;
		int m=arr2.length;
		int l=0;
		int r=n-1;
		int count=0;
		
		while(l<m && r>=0) {
			if((arr1[l]+arr2[r])==x) {
				
				l++;r--;
				count++;
			}
			else if((arr1[l]+arr2[r])<x) {
				l++;
			}
			else {
				r--;
			}
		}
		System.out.println(count);
		
	}
	
	

}
