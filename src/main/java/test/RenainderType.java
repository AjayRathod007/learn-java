package test;

public class RenainderType {
	
	public static void main(String[] args) {
		String s = "43211234";
		
		newString(s);
	}
//		String t ="";
//		int l=s.length();
//		int i=0;
//		int j=l-1;
//		
//		while(i<j)
//		{  
//			if(s.charAt(i)<=s.charAt(j))
//			{
//			    t = preFix(s,i,t);
//			    i++;
//			}
//			else 
//			{
//				t=t+s.charAt(j);
//				j--;
//			}
//		}
//		
//		t+=s.charAt(i);
//		System.out.println(t);
//		
//	}
//
//	private static String preFix(String s, int i, String t) {	
//		String temp = "";
//		temp+= s.charAt(i);
//		
//		for(int j=0; j<t.length(); j++)
//		{
//		   temp+=t.charAt(j);
//		}
//		return temp;
//	}
//
	
	
   public static void newString(String str)
   {
	   
	   StringBuilder s = new StringBuilder(str);
	   String t="";
	   
	    int i=0;
	    int j=str.length()-1;
	    
	    while(i<j)
	    {
	    	if(s.charAt(i)<=s.charAt(j))
			{
			    t += s.insert(0, s.charAt(i));
			    i++;
			}
	    	else
	    	{
	    		t=t+s.charAt(j);
				j--;
	    	}
	    }
	    
	    System.out.println(t);
   }
}
