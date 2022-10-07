package practice;

import java.util.HashSet;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		
		HashSet<Character> set = new HashSet<>();
		
		String str="Great responsibility";
		String ans="";
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&&(str.charAt(i)!=' ')) {
					set.add(str.charAt(i));
				    break;
				}
				
			}
		}
		
		for(Character x : set) {
			System.out.println(x);
		}
	}

}
