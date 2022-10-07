package test;

public class TwoArraySorted {
	public static void main(String[] args) {
		int arr1[] = {1,3,5,7};
		int arr2[] = {2,3,5,8};
		int count = 0;
		int rem = 0;
		int sum = 10;
		for (int i = 0; i < arr1.length; i++) {
			rem = sum - arr1[i];
			boolean flag = binarySearch(arr2, rem);
			System.out.println(flag);
			if (flag == true) {
				count++;
				System.out.println(count);
				
			}
		}
		
		System.out.println(count);

	}

	public static boolean binarySearch(int arr2[], int rem) {
		int end = arr2.length - 1;
		int start = 0;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr2[mid] == rem) {
				return true;

			} else if ( arr2[mid] < rem) {
				start = mid + 1;
			

			} else if (arr2[mid]>rem) {
				end = mid - 1;
				
			}
		}
		return false;
	}
}
