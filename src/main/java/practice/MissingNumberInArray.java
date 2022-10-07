package practice;

import java.util.Arrays;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,3,7,8};
		int ans=0;
		Arrays.sort(arr);
         for(int x:arr) {
        	 System.out.print(x);
         }
         System.out.println();
		for(int i=0;i<arr.length;i++) {
			int a=arr[0]+i;
	
			if(a!=arr[i]) {
				System.out.println("misiing="+a);
				break;
			}
		}
	}
}
