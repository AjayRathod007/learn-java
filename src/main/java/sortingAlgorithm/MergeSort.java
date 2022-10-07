package sortingAlgorithm;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {9,4,7,6,3,1,5};
		int n=arr.length;
		findSort(arr,0,n-1);
		
		for(int x:arr){
			System.out.print(x+",");
		}
	}

	private static void findSort(int[] arr, int startidx, int lastidx) {
		// TODO Auto-generated method stub
		if(startidx>=lastidx) {
			return;
			
		}
			int mid = startidx+(lastidx-startidx)/2;//(left+right)/2;
			findSort(arr,startidx,mid);
			findSort(arr,mid+1,lastidx);
			merge(arr,startidx,mid,lastidx);
			
		
		
		
	}

	private static void merge(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		
		int[] b =new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<=arr[j]) {
				
				b[k++]=arr[i++];
				
				
				
			}else {
				b[k++]=arr[j++];
				
			}
			
			
		}
		
			while(j<=ei) {
				b[k++]=arr[j++];
				
				
			}
		
				while(i<=mid) {
					b[k++]=arr[i++];
					
					
				}
			
		
		for(int a=0,c=si;a<b.length;a++,c++) {
			arr[c]=b[a];
		}
		
		
	}

}
