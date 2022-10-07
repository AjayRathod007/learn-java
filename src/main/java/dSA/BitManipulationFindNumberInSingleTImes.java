package dSA;

public class BitManipulationFindNumberInSingleTImes {
	public static void main(String[] args) {
		int [] arr= {5,4,1,4,3,5,1};
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			res=res^arr[i];
		}
		System.out.println("singleOccurenceNumber=:"+res);
	}

}
