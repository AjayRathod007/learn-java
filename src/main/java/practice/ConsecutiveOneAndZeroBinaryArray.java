package practice;

public class ConsecutiveOneAndZeroBinaryArray {
	public static void main(String[] args) {
		int [] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int maxOnes=0;
		int ones=0;
		int maxZeros=0;
		int zero=0;
		int l=arr.length;
		for(int i=0;i<l;i++ ) {
			if(1 == arr[i]  && (arr[i] != 0)) {
				ones++;
			}
			else {
				if(maxOnes < ones) {
					maxOnes=ones;
					
				}
				ones=0;
				
			}
			
		}
		System.out.println(maxOnes);
		if(maxOnes<ones)
			maxOnes=ones;
		System.out.println(maxOnes);
		
		
		for(int j=0;j<l;j++) {
		
			if(arr[j] == 0 && (arr[j]!=1)) {
				zero++;
			}
			else {
				if(maxZeros<zero) {
					maxZeros=zero;				
				}
				zero=0;
			}
		}
		System.out.println(maxZeros);
		if(maxZeros<zero)
			maxZeros=zero;
		System.out.println(maxZeros);
		
		if(maxOnes>maxZeros)
			System.out.println("Ones= "+maxOnes);
		else
			System.out.println("Xeros "+maxZeros);
	}
	
	
}
