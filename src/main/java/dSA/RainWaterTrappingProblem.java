package dSA;

public class RainWaterTrappingProblem {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,0,1,3,2};
		rainWater(arr);
		
		
	}

	private static void rainWater(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int left[]=new int[n];
		int right[] = new int[n];
		left[0]=arr[0];
		right[n-1]=arr[n-1];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=(Math.min(left[i], right[i])-arr[i]);
		}
		System.out.println(ans);
	}

}
