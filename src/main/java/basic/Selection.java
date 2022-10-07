package basic;

import java.util.Scanner;

public class Selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		int l=arr.length;
		int max=0;
		int index =0;
		for(int i=0;i<arr.length;i++) {
			max=0;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>max) {
					max=arr[j];
					index = j;
					
				}
			}
			int c=arr[index];
			arr[index]=arr[l-i-1];
			arr[l-i-1]=c;
			
		}
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]);
		}
	}

}
