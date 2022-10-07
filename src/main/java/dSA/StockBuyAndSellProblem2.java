package dSA;

public class StockBuyAndSellProblem2 {
	public static void main(String[] args) {
		int[] arr = {5,2,6,1,4,7,3,6};
		findMaxProfit(arr);
	}

	private static void findMaxProfit(int[] arr) {
		// TODO Auto-generated method stub
		int profit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		System.out.println(profit);
		
	}

}
