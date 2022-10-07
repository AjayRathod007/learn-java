 package recursion;

public class StringSubsequences {
	public static void main(String[] args) {
		String str = "abc";
		subsequence(str,0,"");
		
	}
	public static void subsequence(String str,int idx,String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(idx);
		//to be
		subsequence(str,idx+1,newString+currentChar);
		//to be not
		subsequence(str,idx+1,newString);
	}

}
