package test;

public class SortingArray {
	public static void main(String[] args) {
		int[] arr = {9,10,122,8,1290};
		int l= arr.length;
		int [] ans = new int[l];
	
		
		for(int i=0;i<arr.length;i++) {
	         		int num = arr[i];
	         		int c=0;
	         		
	         		while(num>0) {
	         		num=num/10;
	         		 c++;
	         		}
	         		
	         		ans[i]=c;
		}
		
		findSortArray(ans,arr);
		
	
		
	}
	
	private static void findSortArray(int[] ans,int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapped = false;
			for(int j=0;j<n-1;j++) {
				if(ans[j+1]<ans[j]) {
					swapped=true;
					swap(ans,j+1,j,arr);
					
				}
			}
			if(!swapped) {
				break;
			}
			
		}
	}

	private static void swap(int[] ans, int i, int j,int[] arr) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		int temp2=ans[i];
		ans[i]=ans[j];
		ans[j]=temp2;
		
	}


}
