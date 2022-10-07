package dSA;

public class SubsequencesOfString {
	public static void main(String[] args) {
		String str = "abc";
		findSubsequences(str,0,"");
		
	}

	private static void findSubsequences(String str, int idx, String newString) {
		// TODO Auto-generated method stub
		if(idx==str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar=str.charAt(idx);
		//to be
		findSubsequences(str,idx+1,newString+currChar);
		//to be not
		findSubsequences(str,idx+1,newString);
	}

}
