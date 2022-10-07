package StringArrayPractice;

public class MaximumConsecutiveOnesZeroBinaryArray {
	public static void main(String args[]) {
		int[] arr = { 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 };
		findMaximumOnesAndZeros(arr);
	}

	private static void findMaximumOnesAndZeros(int[] arr) {

		int maxOnes = 0;
		int maxZeros = 0;
		int l = arr.length;
		int ones = 0;
		int zeros = 0;
		for (int i = 0; i < l; i++) {

			if (1 == arr[i] && (arr[i] != 0)) {
				ones++;

			} else {

				if (maxOnes < ones) {
					maxOnes = ones;
					ones = 0;
				}

			}
		}
		System.out.println(maxOnes);

		for (int i = 0; i < l; i++) {

			if (0 == arr[i] && (arr[i] != 1)) {
				zeros++;

			} else {

				if (maxZeros < zeros) {
						maxZeros = zeros;
					zeros = 0;
				}

			}
		}
		if (maxZeros < zeros) {
			{
				maxZeros = zeros;
				System.out.println(zeros);
			}

		}

	}
}
