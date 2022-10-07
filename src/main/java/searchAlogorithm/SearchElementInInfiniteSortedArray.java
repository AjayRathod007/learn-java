package searchAlogorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInInfiniteSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the searching element");
		int key = sc.nextInt();
		int n=100000000;
		int [] arr = new int[n];
		Arrays.fill(arr, -1);
		System.out.println("enter the element of  array");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int ans = searchInfinite(arr,key);
		System.out.println(ans);
	}

	private static int searchInfinite(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = 1;
		while(arr[high]<key && arr[high]!=-1) {
			low=high;
			high=2*high;
		}
		return binarySearch(arr,key,low,high);
	}

	private static int binarySearch(int[] arr, int key, int low, int high) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
				}
				else if(arr[mid]>key) {
					high = mid-1;
					
				}else {
					low =mid+1;
				}
			}
		
		
		return -1;
	}

}
