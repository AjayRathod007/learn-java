package practice;

public class ArrayPaytm {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,0,1};
		//{0 1 2 3}
		
		for(int i=0;i<arr.length;i++) {
			 int s = arr[(arr[i])];
			 if(s>10) {
				 s=s/10;
			 }
			 
			 int a =arr[i]*10+s;
			arr[i]=a;
			
		}
		for(int x:arr) {
			System.out.println(x);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(arr[i])%10;
		}
		
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
