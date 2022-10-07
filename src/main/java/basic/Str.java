package basic;

import java.util.Scanner;

public class Str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of string");
		 String name = sc.nextLine();
		/*int n;
		n = sc.nextInt();
		System.out.println("enter the string");

		String[] input = new String[n];
		int i = 0;
		while (i < n) {
			String inputStr = sc.nextLine();
			input[i] = inputStr;
			i++;
		}
		i = 0;
		while (i < n) {
			System.out.print(input[i]);
			i++;
		}*/
		//mostWordsFound(input);
		// aj(name);
	 aj1(name);
	}

	public static int mostWordsFound(String[] sentences) {
		for (int i = 0; i < sentences.length; i++) {
			aj1(sentences[i]);
		}
		// aj1()
		return 0;
	}

	private static void aj1(String name) {
		int l = name.length();
		int i = 0;
		int count = 0;
		while (i < l) {
			if (name.charAt(i) != ' ') {
				count++;
				int j = i;
				while (j < l && name.charAt(j) != ' ') {
					j++;
				}
				i = j;
			}
			else {
				i++;
			}
		}
		System.out.println("aj1:" + count);
	}

	public static void aj(String name) {
		int l = name.length();

		int count = 0;
		char prevC = ' ';
		boolean isOtherThanSpaceCharExist = false;
		boolean isLastCharIsSpace = false;

		for (int i = 0; i <= l - 1; i++) {
			char c = name.charAt(i);
			if (c != ' ') {
				isOtherThanSpaceCharExist = true;
			}
			if (i > 0) {
				prevC = name.charAt(i - 1);
			}
			if (c == ' ') {
				if (prevC != ' ') {
					count++;
				}

			}

		}
		int x = 0;
		if (l > 0 && name.charAt(l - 1) == ' ') {
			x = 1;
		}
		if (isOtherThanSpaceCharExist && x == 0) {
			System.out.println(count + 1);
		} else {
			System.out.println(count);
		}

	}
}
