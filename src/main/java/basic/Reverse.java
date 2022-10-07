package basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		banti();
	}

	public static void banti() {
		int a;
		int rem;

		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		a = sc.nextInt();
		while (a != 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println("rev no. = " + rev);
	}
}
