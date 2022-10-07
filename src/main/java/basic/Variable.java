package basic;

import java.util.Scanner;

public class Variable {

	/***
	 * int long float double
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2;
		long b = 2l;
		float c = 0.23f;
		double d = 9.3;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);
		System.out.println(d);

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter integer input");
		int aa = sc.nextInt();
		System.out.println("please enter long input");
		long bb = sc.nextLong();
		System.out.println("please enter float input");
		float cc = sc.nextFloat();
		System.out.println("please enter input");
		double dd = sc.nextDouble();

		System.out.printf("integer value %d \n", aa);// concatation
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);

		if (aa == 5) {
			System.out.println("aa is equalto 5");
		} else {
			System.out.println("aa is not equalto 5");
		}

	}

}
