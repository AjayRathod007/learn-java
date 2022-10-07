package practice;

import java.util.Scanner;

public class StringOfSubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		int counting=pairOfSubString(str);
		System.out.println("count of subStrings"+counting);
	}

	private static int pairOfSubString(String str) {
		String ans = "";
		int count=0;
		for (int k = 0; k < str.length(); k++) {
			for (int i = k; i < str.length(); i++) {
				ans = "";
				for (int j = k; j <= i; j++) {
					char c = str.charAt(j);
					ans = ans + c;

				}
				System.out.println(ans);
				count++;
			}

		}
		return count;
		// TODO Auto-generated method stub

	}

}
