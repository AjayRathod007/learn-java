package basic;

public class Main {
	public static void main(String[] args) {
		// Main m = new Main();

		explicit();
	}

	public static void explicit() {
		System.out.println("\n inside the typeCasting");
		long a = 65;
		int b = (int) a;
		System.out.println("b;" + b);

		byte narrowedByte = (byte) 12345;
		System.out.println("narrowedByte:" + narrowedByte);

		int iTruncated = (int) 0.99;
		System.out.println("iTruncated:" + iTruncated);

		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		byte bByte = 65;
		cChar = (char) bByte;
		System.out.println("cChar: " + cChar);
	}

}
