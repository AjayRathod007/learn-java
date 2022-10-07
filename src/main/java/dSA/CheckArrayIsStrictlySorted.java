package dSA;

import java.util.Scanner;

public class CheckArrayIsStrictlySorted {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int idx=0;
		boolean flag = checkSortedArray(arr,idx);
		if(flag) {
			System.out.println("sorted");
		}else {
			System.out.println("not sorted");
		}
	}

	private static boolean checkSortedArray(int[] arr, int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length-1) {
			return true;
		}
		if(arr[idx]<arr[idx+1]) {
			return checkSortedArray(arr,idx+1);
		}else {
			return false;
		}
		
	}

}
