package dSA;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two numbwr");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int res=findGcd(a,b);
		System.out.println(res);
	}

	private static int findGcd(int a, int b) {	
		if(b==0) return a;
		
			return findGcd(b,a%b);
	}

}
