package dSA;

import java.util.Scanner;

public class New {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		 distinctPowerOf3(n);
		

	}

	public static void distinctPowerOf3(int n){
		while(n>0){
			if(n%3==2){
				//System.out.println("NO");
				return ;
			}
			n /= 3;
		}
		
		System.out.println("yes"+n);
	}

	

}
