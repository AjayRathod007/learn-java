package basic;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					
				}else {
					int c = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
			}
		}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	

}
