package dSA;

import java.util.HashSet;

public class UniqueSubsequences {
	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		findSubsequences(str,0,"",set);
		
	}

	private static void findSubsequences(String str, int idx, String newString,HashSet<String> set) {
		// TODO Auto-generated method stub
		if(idx==str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
				
			System.out.println(newString);
			set.add(newString);
			return;
			}
		}
		char currChar=str.charAt(idx);
		//to be
		findSubsequences(str,idx+1,newString+currChar,set);
		//to be not
		findSubsequences(str,idx+1,newString,set);
	}

}



