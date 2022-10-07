package recursion;

public class StairClimbing {
	
	public static int totalNumberOfClimbing(int []arr, int n, int x)
	{
		
		if(x==0)
			  return 1;	 
		
		if(n==0)
			return 0;
		
		
		
		if(x >= arr[n-1])
			return totalNumberOfClimbing(arr, n, x-arr[n-1]) + totalNumberOfClimbing(arr, n-1, x);
		else
			return totalNumberOfClimbing(arr, n-1, x);
		
		
	}
	
	public static void main(String[] srg)
	{
		
		
		int arr[] = {1,2,3};
		int x = 5; 
	    System.out.println(totalNumberOfClimbing(arr,arr.length,x));
	}

}
