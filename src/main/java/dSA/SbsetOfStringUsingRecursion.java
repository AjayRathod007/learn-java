package dSA;

public class SbsetOfStringUsingRecursion {
	public static void main(String[] args) {
		String str = "abc";
		String curr="";
		int i=0;
		String ans = findSubset(str,i,curr);
		System.out.println(ans);
	}

	private static String findSubset(String str, int i, String curr) {
		if(i==str.length()) {
			System.out.println(curr);
			return curr;
		}
		
		findSubset(str,i+1,curr+str.charAt(i));
		findSubset(str,i+1,curr);
		return curr;
		
		
	}

}
