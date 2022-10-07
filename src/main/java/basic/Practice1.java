package basic;
import java.util.Scanner;
public class Practice1 {
	
	public static void main(String[] args) {
		
		  //Practice1 p = new Practice1();
		  
		  checkEquality();
		 
		//checkEquality();
		
	}
	
	 static void checkEquality() {
		int a;
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer a");
		a=s.nextInt();
		System.out.println("enter the integer b");
		b=s.nextInt();
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		boolean y = (a==b);
		
		if(y) {
			System.out.println("a isequal to b");
		}
		else {
			System.out.println("none");
		}
			
	}

}
