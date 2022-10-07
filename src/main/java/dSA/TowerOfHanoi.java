package dSA;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of disk");
		int n=sc.nextInt();
		findStepOfTower(n,"S","H","D");
	}

	private static void findStepOfTower(int n, String src, String helper, String destination) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println("Transfer disk "+n+"from" +src +"to" +destination);
			return;
		}
		findStepOfTower(n-1,src,destination,helper);
		System.out.println("Transfer disk "+n+"from" +src +"to" +destination);
		findStepOfTower(n-1,helper,src,destination);
		
	}

}
