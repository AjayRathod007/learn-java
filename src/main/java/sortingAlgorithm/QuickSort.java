package sortingAlgorithm;

public class QuickSort {
	public static void main(String[] args) {
		int [] arr = {4,6,2,5,7,9,1,3};
		
		int n=arr.length-1;
		findSort(arr,0,n-1);
		for(int x:arr) {
			System.out.println(x+",");
		}
	}

	private static void findSort(int[]arr,int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			int pivot=partition(arr,low,high);
			findSort(arr,low,pivot-1);
			findSort(arr,pivot+1,high);
		}
		
		
	}

	private static int partition(int[] arr,int low, int high) {
		// TODO Auto-generated method stub.
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;//pivot index
	
	}


}
