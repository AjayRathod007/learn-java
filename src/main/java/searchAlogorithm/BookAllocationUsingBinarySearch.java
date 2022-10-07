package searchAlogorithm;

public class BookAllocationUsingBinarySearch {
	public static void main(String[] args) {
		int[]arr= {10,5,20};
	int key=2;
	int ans = minPages(arr,key);
	System.out.println(ans);
		
	}

	private static int minPages(int[] arr, int key) {
		// TODO Auto-generated method stub
		int min =maxOfArray(arr);
		int max =sumOfArray(arr);
		int res = 0;
		while(min<=max) {
			int mid = (min+max)/2;
			if(isFeasible(arr,key,mid)) {
				res=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		return res;
	}

	private static boolean isFeasible(int[] arr, int key, int res) {
		// TODO Auto-generated method stub
		int student = 1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]>res) {
				student++;
				sum = arr[i];
			}else {
				sum +=arr[i];
			}
		}
		
		
		return student<=key;
	}

	private static int sumOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		return sum;
	}

	private static int maxOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		return max;
	}

}
