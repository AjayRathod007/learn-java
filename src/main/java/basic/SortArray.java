package basic;

public class SortArray {
	public static void main(String[] args) {
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = {6,7,8,9,10};
	
	int l = arr2.length;
	
	int k = 12;
	int count = 0;
	for(int i=0; i<arr1.length; i++) {
		
		if(isFind(arr2,arr1[i],k))
			count++;
		
	System.out.println(count);
	
	}
}


public static boolean isFind(int arr2[], int a, int k)
{
	int start = 0;
	int end = arr2.length-1;
	
	while(start<=end) {
		
		int mid = (start+end)/2;
		if(arr2[mid]==(k-a))
		 {
			return true;
		 }
		else if(arr2[mid]>(k-a)) {
			//start = 0;
			end = mid-1;
		}
		else {
			start = mid+1;
			//end = l-1;
		}
	}
	return false;
}
}