package basic;
import java.util.Scanner;

public class ArrayIntialize {

	public static void ajay() {
		int[] a = new int[] {1,2,3,4};
		int g;
		Scanner e = new  Scanner(System.in);
		System.out.println("enter the value");
		g = e.nextInt();
		
		for(int i=0; i<a.length; i++) {
			if(g == a[i]) {
				System.out.println("array value is equal to given number" );
				break;
				
			}
			else {
				System.out.println(" not found");
				break;
			}
			
			
		}
	
		

		 }
	public static void main(String[] args) {
		ajay();
	}
		 
		
	}


