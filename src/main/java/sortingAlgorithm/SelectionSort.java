package sortingAlgorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {4,1,9,2,3,6};
		findSort(arr);
	}

	private static void findSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				swap(arr,min,i);
			}
		}
		for(int x:arr) {
			System.out.print(x+",");
		}
		
	}

	private static void swap(int[] arr, int min, int i) {
		// TODO Auto-generated method stub
		int temp= arr[min];
		arr[min] = arr[i];
		arr[i]=temp;
		
	}

}
