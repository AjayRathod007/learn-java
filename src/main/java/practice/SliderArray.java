package practice;

import java.util.Scanner;

public class SliderArray {
	public static void main(String[] args) {
	int k=4;
	int abc[]=new int[k];
	
	int [] arr= {1,2,2,3,4,5,6,7,8,9};
	
	  for(int i=0;i<=arr.length-k;i++) {
		  int n=0;
		  for(int j=i;j<k+i;j++) {
			abc[n]=arr[j];
			n++;
		  }
		  
		 System.out.println(test(abc));
		  System.out.println("====");
		 // break;
	  }
	}
	//1234
	public static int test(int [] abc) {
		int count=0;
		//int visited=-1;
		
		int duplicateCount=0;
		
		//int temp[]=new int[abc.length];
		
		for(int i=0;i<abc.length;i++) {
			// count=0;
			boolean f=false;
			
			for(int j=0;j<abc.length;j++) {
				if( i!=j && abc[i]==abc[j]) {
					  f=true;
					break;
				}
				
			}
			
			if(f==true)
				duplicateCount+=1;
			
		}
		return 4-duplicateCount;
	}
	
	
}
