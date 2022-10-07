package dSA;

public class FindTwoNumberInSingleOccurence {
	public static void main(String[] args) {
		int [] arr= {5,4,1,4,3,5,1,2};
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res^arr[i];
		}
		
		res = (res & -res);
		int res1 = 0;
		int res2 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&res)>0) {
				res1= (res1 ^ arr[i]);
			}
			else {
				res2=( res2 ^ arr[i]);
			}
		}
		
		System.out.println("The non-repeating elements are "
                + res1 + " and " + res2);
	}

}
