package test;
import java.util.Scanner;
public class excelsheetproblem {
	public static void main(String args[]) {
	
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String str=sc.nextLine();
		if(str.length()==2) {
			for(int j=0;j<str.length();j++) {
				if(j==0) {
				sum=sum+26*(1+str.charAt(j)-'a');//(getValue(str.charAt(j),data));
				}else {
					sum=sum+(1+str.charAt(j)-'a');//getValue(str.charAt(j),data);
				}
			}
		}else {
			sum=sum+(1+str.charAt(0)-'a');
		}
		System.out.println("output"+sum);

		
	}
	
	public static int getValue(char key,int arr[]) {
			int value=arr[key];
		return value+1;
		
		
		
		
	}
}
