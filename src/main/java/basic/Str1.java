package basic;

public class Str1 {
	public static void main(String[] args) {
		aj();
		
	}
	
	public static void aj() {
		String name = "abbacz";
		int count =0;
		
		int arr[] = new int[26];
		
		
		for(int i=0;i<name.length();i++) {
			
	     int diff = name.charAt(i)-'a';
	     arr[diff]=arr[diff]+1;
	     
			
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println( (char)(i+'a') +" counting : "+ arr[i]);
		}
	}

}
