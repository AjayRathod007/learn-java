package basic;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of string");
		// String name = sc.nextLine();
		int n;
		n = sc.nextInt();
		System.out.println("enter the string");

		String[] input = new String[n];
		int i = 0;
		while (i < n) {
			String inputStr = sc.next();
			input[i] = inputStr;
			i++;
		}
		i = 0;
		while (i < n) {
			System.out.print(input[i]);
			i++;
		}

}

}