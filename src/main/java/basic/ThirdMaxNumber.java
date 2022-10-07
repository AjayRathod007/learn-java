package basic;

public class ThirdMaxNumber {
	public static void main(String[] args) {
		int[] arr = {5,7,4,8,9};
		int n = arr.length;
		int k = 3;
		
		int idx = -1;
		int i=0;
	
		while(k>0) {
		
		int max = Integer.MIN_VALUE;
			
		
			for( i=0;i<n;i++) {
				if(arr[i]>max) {
					max = arr[i];
					idx =i;
				}
			}
			
			int t = arr[i-1];
			arr[i-1]=arr[idx];
			arr[idx]=t;
			
			for(int j=0; j<arr.length; j++)
				System.out.print(arr[j]+" ");
			System.out.println();
			
			k--;
			n--;
		}
		
	
		
//		int m1 = arr[0];
//		int m2 = arr[0];
//		int m3 = arr[0];
//		
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>m1) {
//				m3=m2;
//				m2=m1;
//				
//				m1 = arr[i];
//			}else if(arr[i]>m2) {
//				m3=m2;
//				m2 = arr[i];
//			}else if(arr[i]>m3) {
//				m3 = arr[i];
//			}
//		}
//		
	System.out.println(arr[i-1]);
	}

}
