package basic;

import java.util.Scanner;

abstract class Bank {
	public String name = "MyBank";
	public String IFSC = "myBank123";

	public void BankDetail() {
		System.out.println("Bank_Name :" + name + " " + "Bank_IFSC Code :" + IFSC);
	}

	abstract void Deposite();

	abstract void Withdraw();

	abstract void checkBal();
}

class bankService extends Bank {
	private double bal = 5000;
	private int pwd;
	private double money;

	public void Deposite() {
		System.out.println("enter Password :");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 123) {
			System.out.println("enter Deposite amount");
			money = sc.nextDouble();
			bal = bal + money;
			System.out.println("Deposited Money :" + money);
			System.out.println("total Balance :" + bal);
		} else {
			System.out.println("incorrect password");
		}
	}

	public void Withdraw() {
		System.out.println("enter Password :");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 123) {
			System.out.println("enter Withdraw amount");
			money = sc.nextDouble();
			bal = bal - money;
			System.out.println("Withdraw Money :" + money);
			System.out.println("total Balance :" + bal);
		} else {
			System.out.println("incorrect password");
		}
	}

	public void checkBal() {
		System.out.println("enter Password :");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 123) {

			System.out.println("total Balance :" + bal);
		} else {
			System.out.println("incorrect password");
		}
	}

}

class Customer {
	public static void main(String[] args) {
		bankService b = new bankService();
		b.BankDetail();

		int ch;
		System.out.println("1. Deposite:");
		System.out.println("2. Withdraw:");
		System.out.println("3. checkBal");

		System.out.println("/n Enter Your Choice");
		Scanner S2 = new Scanner(System.in);
		ch = S2.nextInt();

		switch (ch) {
		case 1:
			b.Deposite();
			break;
		case 2:
			b.Withdraw();
			break;
		case 3:
			b.checkBal();
			break;
		default:
			System.out.println("invalid choices....");
		}

	}
}