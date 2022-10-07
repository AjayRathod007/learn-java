package basic;

public class Array2DSum {
	public static void sum(int arr1[][],int arr2[][]) {
		int[][] ans = new int[3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				ans[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}
	public static void main(String[] args) {
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[][] {{10,11,12},{13,14,15},{16,17,18}};
		sum(arr1,arr2);
		}
	}


