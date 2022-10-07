package searchAlogorithm;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the searching element");
		int key = sc.nextInt();
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the element of  array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int low = 0;
		int high = n-1;
		int ans = binaryRecursive(arr,low,high,key);
		System.out.println(ans);
	}

	private static int binaryRecursive(int[] arr, int low, int high, int key) {
		// TODO Auto-generated method stub
		if(low>high) {
			return -1;
		}
		int mid= (low+high)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]>key) {
			return binaryRecursive(arr,low,mid-1,key);
		}
		return binaryRecursive(arr,mid+1,high,key);
			
	}

}
