package basic;

public class Binary {
	public static void main(String[] args) {
	int [] arr = {1,2,3,8,11,16,20};
	int l = arr.length;
	int x = 8;
	int start = 0;
	int end = l-1;
	
	while(start<=end) {
	
		int mid = (start + end)/2;
		if(arr[mid]==x) {
			System.out.println("find");
			break;
		}
		else if(arr[mid]>x) {
			
			end = mid-1;
		}
		else if(arr[mid]<x) {
			start = mid+1;
			
		}
		
	}
	}
}
