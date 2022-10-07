package basic;

import java.util.Scanner;

public class NumberReversePallindrome {
	public static void main(String[] args) {
		aj();
	}

	public static void aj() {
		int no;
		int rev = 0;
		int rem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		no = sc.nextInt();
		int temp = no ;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (no == rev) {
			
			System.out.println("this is pallendrome: " + rev);

		}

		else {
			
			System.out.println("this is not pallendrome: " + rev);
		}
	}

}
