package practice;

import java.util.Scanner;

public class FIndSumIsEqualToGivenNumber {
	public static void main(String[] args) {
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12} ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number");
		int n=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(n==arr[i]+arr[j]) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		
		
	}

}
