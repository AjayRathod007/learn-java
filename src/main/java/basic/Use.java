package basic;

import java.util.Scanner;

public class Use {

	public static void main(String[] args) {
		aj();
	}

	public static void aj() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String name = sc.nextLine();

		int l = name.length();
		int count = 0;
		for (int i = 0; i <= l - 1; i++) {
			char c = name.charAt(i);

			if (c == ' ') {
				count++;

			}

		}

		System.out.println(count + 1);

	}
}
