
public class PreviousGreaterElement {
	public static void main(String[] args) {
		int[] arr = {3,10,5,1,15,10,7,6};
		
		for(int i = arr.length-1;i>0;i--) {
			for(int j = i-1;j>=0;j--) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[j];
					break;
				}else if(j == 0 ) {
					arr[i] = -1;
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
