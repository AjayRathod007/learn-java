package recursion;

public class PrintNumber {
	public static void main(String[] args) {
		printnumb(5);

	}

	public static void printnumb(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		printnumb(n - 1);
	}

}
