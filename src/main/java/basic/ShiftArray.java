package basic;

public class ShiftArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int l = arr.length;
		int t = arr[0];
		for(int i=0;i<l-1;i++) {
			arr[i]=arr[i+1];
	
		}	
		arr[l-1]=t;
		
		
		for(int c : arr)
			System.out.print(" "+c);
	}

}
