
public class CodeByteProblem2 {
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String ans ="";
		int max=26;
		int[] arr = new int[max];
		
		for(int i=0;i<str.length();i++) {
			int idx = str.charAt(i)-'a';
			arr[idx]=arr[idx]+1;
			
			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				char c = (char) (97+i);
				ans=ans+c+arr[i];
			}
		}
		
		System.out.println(ans);
	}

}
