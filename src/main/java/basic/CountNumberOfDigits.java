package basic;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		banti();
	}

	public static void banti() {
		int a;
		

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		a = sc.nextInt();
		while (a != 0) {
			a = a / 10;
			count++;
			
		}
		System.out.println(" no. = " + count);
	}
}
