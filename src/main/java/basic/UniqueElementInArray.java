package basic;

import java.util.ArrayList;

public class UniqueElementInArray {
	public static void main(String args[] ){
	  String [] arr = new String[6];
	  arr[0]="ajay";
	  arr[1]="ashutosh";
	  arr[2]="india";
	  arr[3]="ajay";
	  arr[4]="india";
	  arr[5]="ashutosh";
	  int l=arr.length;
	  
	  
	  int count=0;
	  
	  for(int j=0;j<l;j++) {
		  boolean temp = false;
	  for(int i=0;i<l;i++) {
		  
		  if( i!=j && (arr[j].equals(arr[i]))) {
			  temp=true;
			  break;
		  }  
	  }
	  
	  if(temp==false) {
		  System.out.println(arr[j]);
	  count++;
	  }
	  
	  }
	System.out.println(count);
	}

}
