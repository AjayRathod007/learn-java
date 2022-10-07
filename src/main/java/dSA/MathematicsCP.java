package dSA;

import java.util.Arrays;
import java.util.Scanner;

public class MathematicsCP {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean[] isPrime=seiveOfErathoSthenes(n);
		for(int i=0;i<=20;i++) {
			System.out.println(i+ " " +isPrime[i]);
		}
	}

	private static boolean[] seiveOfErathoSthenes(int n) {
		boolean isPrime [] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			for(int j=2*i;j<n;j+=i) {
				isPrime[j]=false;
			}
		}
		
		return isPrime;
		
	}
	

}
