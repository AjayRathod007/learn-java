package sortingAlgorithm;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr = {8,4,1,5,9,2};
		findSort(arr);
	}

	private static void findSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
			
		}
		
		for(int x:arr) {
			System.out.print(x+",");
		}
		
	}

}
