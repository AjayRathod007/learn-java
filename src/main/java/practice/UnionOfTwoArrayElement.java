package practice;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfTwoArrayElement {
	public static void main(String[] args) {
		int arr1[]= {7, 1, 5, 2, 3, 6};
		int arr2[]= {3, 8, 6, 20, 7};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			arr.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			int a=arr2[j];
			boolean response=duplicateCheck(a,arr1);
			if(response!=true) {
				arr.add(arr2[j]);
			}
		}
		
			System.out.println("output"+arr);
			Collections.sort(arr);
			System.out.println("answer"+arr);
		
	}
	
	public static boolean duplicateCheck(int a ,int[] arr1) {
		boolean response =false;
		for(int k=0;k<arr1.length;k++) {
			if(a==arr1[k]) {
				response=true;
			}
		}
		return response;
	}

}
