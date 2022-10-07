package test;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {2,3,5,8};
		int l1=arr1.length;
		int l2=arr2.length;
		int s=0;
		if(l1>l2) {
			 s =l1;
		}
		else {
			s=l2;
		}
		int x= 10;
		int i=0;int j=0;
		int sum=0;
		while( i < l1) {
			
			if(arr1[i]+arr2[j]==x) {
				System.out.println(i+""+j);
			  
			}
			
			j++;
			
			if(j==arr2.length) {
				i++;
				j=0;
				
			}
		}
	}

}
