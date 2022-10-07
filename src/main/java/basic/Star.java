package basic;

public class Star {
	public static void aj() {
		int i;
		int j;
		int k;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				if (j <= (3 - i)) {
					System.out.print(' ');
				} else {
					System.out.print("*");

				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		aj();
	}

}
