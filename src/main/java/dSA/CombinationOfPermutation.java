package dSA;

public class CombinationOfPermutation {
	public static void main(String[] args) {
		String str="abc";
		calPermutation(str,"");
		
	}
	
	public static void calPermutation(String str,String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char currChar = str.charAt(i);
			//abc->"bc"
			
			String newStr=str.substring(0, i)+str.substring(i+1);
			calPermutation(newStr,permutation+currChar);
		}
	}

}
