package practice;

public class Joseph {
	
    public static void main(String[] arg)
    {
    	int n=5;
    	int k=3;
    	
    	int a[] = new int[n];
    	for(int i=0; i<n; i++)
    	     a[i]=i;
    	
    	// (0,1,2,3,4)
    	
    	int y=0;
    	int j=0;
    	while(n>1)
    	{
    		y = (y+k-1)%n;
    		int m=y;
    		
    	      while(m<n-1)
    	      {
    	    	 a[m] = a[m+1];
    	    	 m++;
    	      }
    		n--;
    	}
    	
    	
        System.out.println(a[0]);
    }

}
