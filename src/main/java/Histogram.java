
public class Histogram {
	public static void main(String[] args) {
		int[] arr = {4,2,1,5,6,3,2,4,2};
		
		int area = isHistogramArea(arr);
		System.out.println(area);
	}

	private static int isHistogramArea(int[] arr) {
		// TODO Auto-generated method stub
		
		int area = 0;
		int maxArea =0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			int val =arr[i];
			int idx = i;
			int count1 = leftSideCounting(arr,idx-1,val);
			int count2 = rightSideCounting(arr,idx+1,val);
			
			//System.out.println();
			count = count1+count2+1;
			
			//4,2,1,5,6,3,2,4,2	
					area = count*val;
					System.out.println(count1 +" "+count2 +" --> "+area+" ");
					if(area>maxArea) 
					{
					  maxArea = area;}
				
			
		}
		
		return maxArea;
		
	}

	private static int rightSideCounting(int[] arr, int idx,int val) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=idx;i<arr.length;i++) {
			if(val<=arr[i]) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}

	private static int leftSideCounting(int[] arr, int idx,int val) {
		// TODO Auto-generated method stub
		int count=0;
		for(int j=idx;j>=0;j--) {
			if(val<=arr[j]) {
				count++;
			}else {
				break;
			}
			
			
		}
		return count;
	}

}
