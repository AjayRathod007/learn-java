package basic;

import java.util.Scanner;

class FirstPalindrome {
	public static void main(String args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thesize of array:");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}

	}

	public String palindrome(String[] words) {
		String s;
		String temp = "";
		String s2 = "";
		for (int i = 0; i < words.length; i++) {
			s = words[i];
			for (int j = s.length() - 1; j >= 0; j--) {
				char c = s.charAt(j);
				temp = temp + c;
			}

			System.out.println(temp);

			if (s.compareTo(temp) == 0) {
				s2 = temp;
				break;
			}

			temp = ""; // for each iteration need to up
		}
		return s2;
	}
}