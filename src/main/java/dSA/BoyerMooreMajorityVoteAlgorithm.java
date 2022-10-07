package dSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BoyerMooreMajorityVoteAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//findMajorityElement(arr);
		//int res=majorityElement(arr);
		//System.out.println(res);
		shortArrayMethod(arr);
	}

	private static void findMajorityElement(int[] arr) {
		// TODO Auto-generated method stub
		int l=arr.length;
		int check=l/2;
		int count=0;
		int maxCount=0;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l;j++) {
				if(arr[i]==arr[i+1]) {
					count++;
					if(maxCount<count) {
						maxCount=count;
						
					}
				}
			}
			if(maxCount>check) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static int majorityElement(int a[]) {
		int ansIndex=0;
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==a[ansIndex]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				ansIndex=i;
				count=1;
			}
		}
		
		return checkAnsIndex(ansIndex,a);
	}
	
	public static int checkAnsIndex(int ansIndex,int[] a) {
		int ans =0;
		int l=a.length;
		int check=l/2;
		int count=0;
		for(int i =0;i<a.length;i++) {
			if(a[ansIndex]==a[i]) {
				count++;
			}
		}
		if(check<count) {
			ans=a[ansIndex];
		}
		return ans;
	}
	
	public static void shortArrayMethod(int[] arr) {
		Arrays.sort(arr);
		 int count=1;
		 int maxCount=1;
		 int ansIndex=0;
		 int check=arr.length/2;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				if(count>maxCount) {
					maxCount=count;
					 ansIndex=i;
				}
			}
			
		}
		if(check<maxCount) {
			System.out.println(arr[ansIndex]);
		}
	}
	
//	 private static void findMajority(int[] arr)
//	    {
//	        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
//	 
//	        for(int i = 0; i < arr.length; i++) {
//	            if (map.containsKey(arr[i])) {
//	                    int count = map.get(arr[i]) +1;
//	                    if (count > arr.length /2) {
//	                        System.out.println("Majority found :- " + arr[i]);
//	                        return;
//	                    } else
//	                        map.put(arr[i], count);
//	 
//	            }
//	            else
//	                map.put(arr[i],1);
//	            }
//	            System.out.println(" No Majority element");
//	    }
//	 
//	  
//	    /* Driver program to test the above functions */
//	    public static void main(String[] args)
//	    {
//	        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
//	         
//	        findMajority(a);
//	    }
//	}

}
