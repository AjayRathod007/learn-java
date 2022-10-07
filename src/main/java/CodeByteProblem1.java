import java.util.Scanner;

public class CodeByteProblem1 {
	public static void main(String[] args) {
		int [] arr = {1, 6, 4, 10, 2, 5};
		
		int l= arr.length;
		int [] ans = new int [l];
	
		int j=0;
		for(int i=l-1;i>0;i--) {
			boolean f = false;
			for( j=i-1;j>=0;j--) {
				if(arr[i]>=arr[j]) {
					f=true;
					break;
				}
			}
			if(f==true) {
				ans[i]=arr[j];
			}
			else {
				ans[i]=-1;
			}
		}
		
		ans[0]=-1;
		for(int x:ans) {
			System.out.print(x+" ");
		}
		
	
	}

}
