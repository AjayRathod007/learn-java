package StringArrayPractice;

public class FindAllPairsOfSum {
	public static void main(String args[]) {
		int a = 15;
		int [] arr = {7,1,6,5,7,8,9,12,3};
		findPairs(arr,a);
	}

	private static void findPairs(int[] arr, int a) {
		int sum=0;
		int l=arr.length;
		int count =0;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]+arr[j]==a) {
					count++;
				}
			}
			
		}
		
	}

}
