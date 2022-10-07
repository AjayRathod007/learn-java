package basic;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		int n = 1;
		Scanner s = new Scanner(System.in);
		while(n<=1) {
			int a;
			System.out.println("enter the value");
			a = s.nextInt();
			if (a == -1) {
				System.out.println("rest:");
				break;
			}else {
				call(a);	
			}
			n++;

		}


	}

	public static void call(int a) {
		int i;
		int temp = 0;

		for (i = 2; i <= a - 1; i++) {

			if (a % i == 0) {
				temp = temp + 1;
				break;
			}
			
		}
		if (temp >= 1) {
			System.out.println("not prime-number:" + a);

		} else {
			System.out.println("prime-number:" + a);
		}

	}

}
