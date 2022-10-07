package basic;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the value of array sum");
		int a = sc.nextInt();
		int[] finalArray = new int[n];
		for(int i=0;i<n;i++) {
		 arraySum(arr,a);
		 
		}
		
	}
	public static int arraySum(int arr[], int a) {
		int sum = 0;
		for(int i=0;i<a;i++) {
			sum = sum+arr[i];
			
		}
		System.out.println(sum);
		return sum;
	}

}
