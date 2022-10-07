package dSA;

public class JosepahProblemUsingRecursion {
	public static void main(String[] args) {
		int n=5,k=3;
		int ans=findWinner(n,k);
		System.out.println("winner: ="+ans);
	}

	private static int findWinner(int n, int k) {
		if(n==1) {
			return 0;
		}
		else {
			return ((findWinner(n-1,k)+k)%n);
		}
		
	}

}
