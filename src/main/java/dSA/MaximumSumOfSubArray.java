package dSA;

import java.util.Scanner;

public class MaximumSumOfSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		findSum(arr);
		
	}

	private static void findSum(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum=Integer.MIN_VALUE;
		 int start = 0;
		 int end = 0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum>maxSum) {
					maxSum=sum;
					start = i;
	                end = j;
				}
			}
			
		}
		//logger.info("Found Maximum Subarray between {} and {}", start, end);
		System.out.println("Found Maximum Subarray between {} and {}"+ start+" "+end);
		System.out.println(maxSum);
		
	}

}
