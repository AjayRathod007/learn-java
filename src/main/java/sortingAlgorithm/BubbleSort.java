package sortingAlgorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {4,3,7,1,5};
		findSortArray(arr);
	}

	private static void findSortArray(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapped = false;
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]<arr[j]) {
					swapped=true;
					swap(arr,j+1,j);
				}
			}
			if(!swapped) {
				break;
			}
			
		}
		
		for(int x:arr) {
			System.out.print(x+",");
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
