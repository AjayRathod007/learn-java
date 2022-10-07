package basic;

public class StringCheck {
public static void main(String args[]) {
	String str="ab";
	boolean res=true;
	String output="abc";                                                                                                                                                                                                                                                                                                                  
	for(int i=0;i<output.length();i++) {
		res=checkChar(output.charAt(i),str);
		if(res==true) {
			if(i==output.length()-1) {
			System.out.print("yes");
			}
		}else {
			System.out.print("no");
			break;
		}
	}
}
public static boolean checkChar(char outChar,String str) {
  boolean result=false;
  for(int j=0;j<str.length();j++) {
	  if(str.charAt(j)==outChar) {
		  result=true;
	  }
	  
  }
	
	return result;
}
}
