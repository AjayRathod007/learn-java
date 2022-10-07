package practice;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "aabc"; 
		String str2 = "abbc" ;
			int k = 0;
			boolean response=checkAnagram(str1,str2,k);
			if(response==true)
			System.out.println("yes anagram");
			else
				System.out.println("not anagram");
	}
			private static boolean checkAnagram(String str1, String str2, int k) {
		// TODO Auto-generated method stub
				int max=26;
				int count=0;
				if(str1.length()!=str2.length())
					return false;
				
				
				int[] arr1 = new int[max];
				
				for(int i=0;i<str1.length();i++) {
					int idx = str1.charAt(i)-'a';
					arr1[idx]=arr1[idx]+1;
				}
				
	            int[] arr2 = new int[max];
				
				for(int i=0;i<str2.length();i++) {
					int idx = str2.charAt(i)-'a';
					arr2[idx]=arr2[idx]+1;
				}
				
				for(int i=0;i<max;i++) {
					if(arr1[i]>arr2[i]) {
						count=count+Math.abs(arr1[i]-arr2[i]);
					}
				}
				
				if(count<=k)
					return true;
				else
					return false;
				
		
	}
		
}
