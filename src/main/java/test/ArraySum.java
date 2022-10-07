package test;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 3, 5, 8 };
		int l1 = arr1.length;
		int x=10;
		int count = 0;

		int rem = 0;
		for (int i = 0; i < l1; i++) {

			rem = 10 - arr1[i];
			boolean flag = binary(arr2, rem);
			if (flag == true) {
				count++;

			}
			System.out.println(count);
		}

	}

	private static boolean binary(int[] arr, int x) {
		// TODO Auto-generated method stub
		int l = arr.length;

		int start = 0;
		int end = l - 1;

		while (start <= end) {

			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return true;
			}

			else if (arr[mid] > x) {

				end = mid - 1;
			} else if (arr[mid] < x) {
				start = mid + 1;

			}

		}
		return false;

	}
}
