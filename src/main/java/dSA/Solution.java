package dSA;
import java.io.*;
import java.util.*;


public class Solution{

    private static String isSafeSequence(int arr[]){

        Stack<Integer> seq = new Stack<>();

        for(int x : arr)
         {
                if(x%2!=0)
               {
                  seq.push(x);
               }
               else
               {
            	    if(seq.isEmpty())
            		   return "Unsafe";
            	   
            	    int temp = seq.peek();
                    if(temp+1 != x)
                    	return "Unsafe";
                    else
                       seq.pop();
                    	
               }
       }
        
        if(seq.isEmpty())
        	return "Safe";
       
 
        return "Unsafe";
    }
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            int N,arr[];
            for(int testCases =1;testCases<=T;testCases++){
                N = scanner.nextInt();
                arr = new int[N];
                for(int i=0;i<N;i++)
                    arr[i]=scanner.nextInt();
                System.out.println(isSafeSequence(arr));            
            }
            scanner.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}