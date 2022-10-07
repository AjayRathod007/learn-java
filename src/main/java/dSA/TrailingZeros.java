package dSA;

import java.util.Scanner;

public class TrailingZeros {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int res=0;
		for(int i=5;i<=n;i=i*5) {
			res=res+n/i;
		}
		System.out.println("number of trailing zeros= "+res);
	}

}
