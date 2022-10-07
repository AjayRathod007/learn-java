package basic;
import java.util.Scanner;


public class StringExample {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the string name");
		String name = Sc.next();
		int l=name.length();
		int i;
		for(i=l-1; i>=0; i--) {
			char c=name.charAt(i);
			System.out.print(c);
			
		}
		
		
		
		
//		char c=s.charAt(4);
//		int len=s.length();
//		System.out.println(c);
//		System.out.println(len);
		/*char c=s.charAt(0);
		char a=s.charAt(1);
		char b=s.charAt(2);
		char e=s.charAt(3);
		char d=s.charAt(4);
		System.out.println("\n" + d + e + b + a + c);*/
		
		
		

	}
}