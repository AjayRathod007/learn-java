package basic;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		aj();

	}

	public static void aj() {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the string");
		String name = a.next();
		int l = name.length();
		String temp = "";
		
	
		for (int i = l - 1; i >= 0; i--) {
			
			char c = name.charAt(i);
			temp = temp + c;
			
		}
		System.out.println(temp);
		if( temp.compareTo(name)==0) {
			System.out.println("this is a pallendrome:" + temp);
			
			
		}
		else {
			System.out.println("this is not  a pallendrome" + temp);
		}
		

	}
	
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "";
        String temp2 = "";
        boolean arr;
        
        for(int i=0;i<word1.length;i++){
            String c=word1[i];
            temp1 = temp1+c;
        }
        for(int j=0;j<word2.length;j++){
            String d = word2[j];
            temp2 = temp2 + d;
        }
        if(isEqual(temp1, temp2) == true){
            arr= true;
        }
        else{
           arr= false;
        }
        return arr;
    }

	private boolean isEqual(String temp1, String temp2) {
		int l1 = temp1.length();
		int l2 = temp2.length();
		boolean arr = false;
		if(l1 == l2) {
			for(int i=0;i<=l1;i++) {
				char c1 = temp1.charAt(i);
				char c2 = temp2.charAt(i);
				if(c1 == c2)
				{
					arr = true;
					
				}
				else {
					arr = false;
					break;
				}
			}
		}
		
		return arr;
	}

}
