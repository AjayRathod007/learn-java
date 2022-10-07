package basic;
import java.util.Scanner;

public class RevArray {
public static void main(String[] args) {
	int  n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	n = sc.nextInt();
	int[] array = new int[n];
	for(int i=0;i<n;i++) {
		array[i] = sc.nextInt();
		
	}
	aj(array);
}
	


public static void aj(int array[]) {
	int temp;
	
	for(int i=0,j=array.length-1; i<j; i++,j--) {
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
	for(int i=0; i<array.length; i++)
	System.out.println("array[i]" + array[i]);
	
	
	
}
}