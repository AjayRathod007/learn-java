package dSA;

import java.util.Scanner;

public class ApowerB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the two numbwr");
		int base= sc.nextInt();
		int exponent= sc.nextInt();
		
		int ans=powerFunction(base,exponent);
		System.out.println(ans);
	}

	private static int powerFunction(int a, int b) {
		int res=1;
		for(;b!=0;b--) {
			res *=a;
		}
		return res;
		
	}
	
//	public static void main(String[] args) {
//
//	    int base = 3, exponent = 4;
//
//	    long result = 1;
//
//	    while (exponent != 0) {
//	      result *= base;
//	      --exponent;
//	    }
//
//	    System.out.println("Answer = " + result);
//	  }
	
	
	private static int fastPower(int a,int b) {
		int res = 1;
		while(b>0) {
			//if(b%2!=0)
			if((b&1)!=0) {
				res = res*a;
				
			}
			a=a*a;
			b=b>>1;  //b/2
		}
		return res;
	}

}
