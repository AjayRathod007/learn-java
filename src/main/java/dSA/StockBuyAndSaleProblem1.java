package dSA;

public class StockBuyAndSaleProblem1 {
	public static void main(String[] args) {
		int[] arr = {3,5,1,7,4,9,3};
		
		//findMaxProfit(arr);
		int res=maxProfit(arr);
		System.out.println(res);
		
		
	}

	private static void findMaxProfit(int[] arr) {
		// TODO Auto-generated method stub
		int minBuy=Integer.MAX_VALUE;
		int maxSell=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minBuy) {
				minBuy=arr[i];
			}
			if(arr[i]>maxSell) {
				maxSell=arr[i];
			}
		}
		int profit=maxSell-minBuy;
		System.out.println(profit);
		
	}
	
	public static int maxProfit(int[] arr) {
		int maxProfit=0;
		int minSoFar=arr[0];
		for(int i=0;i<arr.length;i++) {
			minSoFar=Math.min(minSoFar, arr[i]);
			int profit=arr[i]-minSoFar;
			maxProfit=Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

}
