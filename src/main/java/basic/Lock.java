package basic;

public class Lock {
	public static void main(String args[]) {
		String in = "1919";
		String out = "0000";
		int count = 0;
		int j = 0;
		int k = 0;
		for (int i = 0; i < in.length(); i++) {

			if (Integer.valueOf(in.charAt(i)) <= 5) {
				k = 0;

			} else {
				j = 9;
			}
			for (k = 0, j = 9; k < 9 && j > 0; k++, j--) {
				
				if (out.charAt(i) - '0' == k || out.charAt(i) - '0' == j) {
					count++;
					break;
				} else {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
