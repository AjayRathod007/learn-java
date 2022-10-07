
public class PreviousSmallerElement {
	public static void main(String[] args) {
		int [] arr = {5,15,20,25,12,20};
		int [] ans = new int [arr.length];
		//int k = arr.length-1;
		//ans[k++]=-1;
//		for(int i=1;i<arr.length;i++) {
//			for(int j=i-1;j>=0;j--) {
//				if(arr[i]>arr[j]) {
//					ans[k++]=arr[j];
//					break;
//				}else if(j==0){
//					ans[k++]=-1;
//					break;
//				}
//				
//			}
//		}
//		
		for(int i = arr.length-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[j];
					break;
				}else if(j==0) {
					arr[i]=-1;
					break;
				}
			}
		}
		arr[0]=-1;
		for(int x:arr) {
			System.out.println(x);
		}
	}
	
	

}
