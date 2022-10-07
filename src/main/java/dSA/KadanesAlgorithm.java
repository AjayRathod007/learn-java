package dSA;

import java.util.Scanner;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		findMaxSumOfSubArray(arr);
	}

	private static void findMaxSumOfSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		int s=0;
		int start=0,end=0;
		
		
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(currSum>maxSum) {
				maxSum=currSum;
				start=s;
				end=i;
			}
			if(currSum<0) {
				currSum=0;
				s=i+1;
			}
		}
		System.out.println(maxSum);
		
	}

}
