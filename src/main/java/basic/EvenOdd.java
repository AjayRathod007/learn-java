package basic;
import java.util.Scanner;
public class EvenOdd {
  public static void main(String[] args) {
	  int a;
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("enter the value of a");
	  a=s.nextInt();
	  
	  if(a % 2 == 0){
		  System.out.println("a is a even number");
		  
	  }
	  else {
		  System.out.println("a is a odd number");
	  }
  } 
}
