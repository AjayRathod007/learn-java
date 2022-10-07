package basic;

public class Subarray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8};
	int max=0;
	int[] sub = new int[3];
	for(int i=0;i<arr.length-2;i++) 
	{
		int j=i;
		int sum=0;
		int count =0;
		while(count<sub.length) {
		
			sum=sum+arr[j];	
			j++;
			count++;
		}
		
		if(sum>max) {
			max=sum;
		
		}
		
	
	}
	System.out.println(max);
}
}
