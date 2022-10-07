package basic;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		aj();

	}

	public static void aj() {
		int n;// arrray size

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		n = sc.nextInt();
		

		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]);
		}
		//System.out.println(count);

	}
}
