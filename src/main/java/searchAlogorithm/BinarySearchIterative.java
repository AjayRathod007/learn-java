package searchAlogorithm;

import java.util.Scanner;

public class BinarySearchIterative {
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
		int ans = binary(arr,low,high,key);
		System.out.println(ans);
	}

	private static int binary(int[] arr, int low, int high,int key) {
		// TODO Auto-generated method stub
		while(low<=high) {
		int mid = (low+high)/2;
		if(key==arr[mid]) {
			return mid;
		}else if(key>arr[mid]) {
			low=mid+1;
		}else {
			high=mid-1;
		}
		}
		
		return -1;
		
	}

}
