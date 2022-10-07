package dSA;

public class LargestNumber {

	public static void main(String[] arg)
	{
	  
      int []arr = {3,30,34,9};
	
	  String[] a = new String[arr.length];
	  int i=0;
	  for(int x : arr)
	  {
		  a[i++]=String.valueOf(x);
	  }
	  
	  
	  for(i=0; i<a.length-1; i++)
	  {
		  for(int j=i+1; j<a.length; j++)
		  {
			  String temp1 = a[i]+a[j];
			  String temp2 = a[j]+a[i];
			  
			  System.out.println(temp1 + " " +temp2);
			  
			  int t1 = Integer.valueOf(temp1);
			  int t2 = Integer.valueOf(temp2);
			  
			  if( t1 < t2)
			  {
				  String t = a[i];
				  a[i]=a[j];
				  a[j]=t;
			  }			    
		  }
	  }
	  
	  
	  String ans = "";
	  for(String x : a)
		   ans+=x;
 
	  System.out.println(ans);
	  
	  
	}
}
