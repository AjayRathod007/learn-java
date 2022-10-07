package searchAlogorithm;

import java.util.Scanner;

public class SearchElementInASortedAndRotatedArray {
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
		int ans = binarySearch(arr,key);
		System.out.println(ans);
	}

	private static int binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[low]<arr[mid]) {
				if(key>=arr[low] && key<arr[mid]) {
					high=mid-1;
					
				}else {
					low = mid+1;
				}
			}else {
				if(key>arr[mid] && key<=arr[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return -1;
	}
	

}
