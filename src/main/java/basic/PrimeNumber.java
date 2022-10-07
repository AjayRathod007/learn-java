package basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		if(num==1||num==0) {
			System.out.println("not prime");
		}
		
		boolean flag = false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		
		if(flag==true)
			System.out.println("not prime number");
		else {
			System.out.println("yes");
		}
	}

}
