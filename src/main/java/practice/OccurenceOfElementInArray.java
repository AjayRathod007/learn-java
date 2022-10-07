package practice;

import java.util.Arrays;

public class OccurenceOfElementInArray {
	public static void main(String[] args) {
		int[] arr= {12, 9, 12, 9, 10, 9, 10, 11};
		int count=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				else
					break;
			}
			System.out.println("element="+arr[i]+":"+"occurence="+count);
			i+=count-1;
		}
//       int[] ocr = new int[100000001];
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			ocr[arr[i]]+=1;
//		}
//		
//		for(int x : arr)
//		{
//			if(ocr[x]>0)
//			  System.out.println(x+": "+ ocr[x]);
//			
//			ocr[x]=0;
//		}
//		
//			}
	}

}
