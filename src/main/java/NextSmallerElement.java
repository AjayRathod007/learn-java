
public class NextSmallerElement {
	public static void main(String[] args) {
		int[] arr = {5,15,20,25,12,20};
		int[] ans = new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[j];
					break;
				}else if(j==arr.length-1){
					arr[i] = -1;
					break;
				}
			}
		}
		
		ans[arr.length-1]=-1;
		
		for(int x:arr)
			System.out.println(x);
	}

}
