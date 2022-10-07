package basic;
import java.util.Scanner;


public class ReverseWord {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String givenString = sc.nextLine();
	int l = givenString.length();
	char[] arr = new char[l];
	for(int i=0;i<l;i++) {
		char c = givenString.charAt(i);
		arr[i]=c;
	}
	int start = 0;
	
    for(int i=0;i<l;i++) {
        if(arr[i]==' ') {
        	int end=i-1;
        	reverseArray(arr,start,end);
        	start =i+1;
        }
/*  if(i==(l-1)) {
        int	end =l-1;
        reverseArray(arr,start,end);
        
        }*/
        
    }
    reverseArray(arr,start,l-1);
    
    String output="";
    for(int i=0;i<l;i++) {
    	output = output + arr[i];
    }
    System.out.println(output);
	}

	public static void reverseArray(char[] arr,int start,int end) {
		for(int i=start,j=end;i<j;i++,j--) {
			char c= arr[i];
			arr[i]=arr[j];
			arr[j]=c;
			
		}
	}
}
