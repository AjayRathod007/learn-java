package practice;

public class SecondLargestElement {
	public static void main(String[] args) {
		int [] arr = {12, 35, 1, 10, 34, 1};
		int num=findNumber(arr);
		System.out.println(num);
	}

	private static int findNumber(int[] arr) {
		// TODO Auto-generated method stub
		int l=arr.length;
		int max=0;
		int secondMax=0;
		for(int i=0;i<l;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		
		for(int j=0;j<l;j++) {
			if(secondMax<arr[j]&&max!=arr[j])
				secondMax=arr[j];
		}
		
		return secondMax;
	}

}
