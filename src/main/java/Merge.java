
public class Merge {
	public static void main(String[] args) {
	int[] arr1 = {1,6,7};
	int[] arr2 = {3,4,8};
	int l1 = arr1.length;
	int l2 = arr2.length;
	int l=l1+l2;
	int j=0,i=0, k=0;
	int[] ans=new int[l];
	
	while(k<l2 && i<l1)
	{
		if(arr1[i]<arr2[k]) {
		    ans[j++]=arr1[i];
		    i++;   
		}
		else {
			
			ans[j++]=arr2[k];
		      k++;
		}
		
	}
	
	if(i==l1) {
		for(int m=k;m<l2;m++) {
			ans[j++]=arr2[m];
			
		}
	}
		if(k==l2) {
			for(int m=i;m<l1;m++) {
				ans[j++]=arr1[m];
		}
		}
	
	
	for(int x:ans) {
		System.out.print(x+" ");
	}
	
	}
}

