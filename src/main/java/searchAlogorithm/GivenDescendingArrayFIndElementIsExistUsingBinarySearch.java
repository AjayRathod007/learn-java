package searchAlogorithm;

public class GivenDescendingArrayFIndElementIsExistUsingBinarySearch {
	public static void main(String[] args) {
		int[] arr = {20,17,14,12,10,9,8,4,2};
		int key = 2;
	int ans=binarySearch(arr,key);
	System.out.println(ans);
	}

	private static int binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low=0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key) {
				low = mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
		
	}

}
