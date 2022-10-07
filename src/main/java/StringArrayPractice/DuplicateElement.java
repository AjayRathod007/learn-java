package StringArrayPractice;

public class DuplicateElement {
	public static void main(String args[]) {
		String [] arr = {"ajay","ashu","banti","ajay","golu","banti"};
		findDuplicateWord(arr);
	}

	private static void findDuplicateWord(String[] arr) {
		int l=arr.length;
		int count=0;
		String temp="";
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp=temp+arr[i];
				}
			}
		}
		
		System.out.println(count);
		System.out.println(temp);
		
	}

}
