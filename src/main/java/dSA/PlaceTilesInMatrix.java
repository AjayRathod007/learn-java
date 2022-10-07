package dSA;

public class PlaceTilesInMatrix {
	public static void main(String[] args) {
		int n=3,m=3;
		int ans=countWayOfTilesPlace(n,m);
		System.out.println(ans);
	}
	
	public static int countWayOfTilesPlace(int n,int m) {
		if(n==m) {
			return 2;
			
		}
		if(n<m) {
			return 1;
		}
		
		//vertically
		int verticalPlace=countWayOfTilesPlace(n-m,m);
		//horizontal
		int horizontalPlace=countWayOfTilesPlace(n-1,m);
		
		return verticalPlace+horizontalPlace;
	}

}
