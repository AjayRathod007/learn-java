
public class CodeByteProblem3 {
	public static void main(String[] args) {
		int[] arr = { 4,3,2,1};
		int idx = findIndex(arr);
		System.out.println(idx);
	}

	private static int findIndex(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int ans = 0;
		int j = 0;
		if (arr[0] < arr[1]) {

			for (i = 0; i < arr.length -1; i++) {
				if (arr[i] < arr[i + 1]) {

					continue;
				} else {
					ans = i;
					break;
				}

			}
			
//			if(arr[i]>arr[i+1])
//			{
//				ans=i;
//				break;
//			}
			
			if (i == arr.length-1)
				return -1;
		} else {
			for (j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					continue;
				} else {
					ans = i;
					break;
				}
			}
			if (j == arr.length-1)
				return -1;
		}
		return ans;
	}

}
