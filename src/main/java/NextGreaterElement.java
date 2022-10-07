
public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = {3,10,5,1,15,10,7,6};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[j];
					break;
				}else if(j == arr.length-1) {
					arr[i]=-1;
					break;
				}
			}
		}
		
		arr[arr.length-1] = -1;
		
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
