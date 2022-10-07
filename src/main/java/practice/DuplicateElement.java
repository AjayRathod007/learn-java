package practice;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,5,3};
		String ans="";
		int count= 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					ans=ans+arr[i];
					
				}
			}
		}
		
		System.out.println(ans);
		
	}

}
