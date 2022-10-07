package StringArrayPractice;

public class SecondLargestElement {
	
	public static void main(String args[]) {
		int[] arr = { 4, 5, 6, 1, 2, 3 };
		secondlargest(arr);
		secondMinimum(arr);
	}

	public static void secondlargest(int[] arr) {
		int max = 0;
		int secMax = 0;
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		for (int j = 0; j < l; j++) {
			if (secMax < arr[j] && max != arr[j])
				secMax = arr[j];
		}

		System.out.println(secMax);
	}
	
	public static void secondMinimum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int temp;
		int l= arr.length;
		
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
			
		}
	}
}
