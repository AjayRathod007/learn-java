package practice;

public class CountDistinctElement {
	public static void main(String[] args) {
		int []arr = {1,2,1,4,5,6,4,};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int j=0;
			for( j=0;j<i;j++) 
				if(arr[i]==arr[j])
					break;
				
				
			
			if(i==j)
				count++;
		}
		System.out.println(count);
	}

}
