package basic;

public class Odd {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			check(i);
		}
	}

	public static void check(int i) {

		if (i % 2 == 0) {
			System.out.println(" even number:" + i);
		} 

	}
}
