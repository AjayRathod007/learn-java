package basic;

import java.util.Scanner;

public class Sort {
	   public static int  partition(int arr[], int s, int l)
	    {
		   
	        int index = 0;
	       
	        int pivot = arr[l];
	        
	        int j=l;
	        
	        while(s<j)
	        {
	            if(arr[s] > pivot)
	             {
	              j--;
	              int t = arr[s];
	              arr[s]=arr[j];
	              arr[j]=t;
	             }
	          else
	            s++;  
	            
	        }
	       
	        int t = arr[j];
	              arr[j]=arr[l];
	              arr[l]=t;
	       
	     return j;
	    }
	   
	   
	    public static void quickSort(int arr[],int s,int l)
	    {
	    	if(s<l)
	    	{
	    		 int index = partition(arr,s,l);
	    		 
	    		   quickSort(arr,s,index-1);
		           quickSort(arr,index+1,l);
	    	}
	    		
	    }
	   
	    public static void main(String[] args) {
	       
	        int arr[] = new int[] {3,4,5,1,2};
	       
	       
	       quickSort(arr,0,arr.length-1);
	       
	       for(int x : arr)
	       System.out.print(x+" ");
	    }
	}


