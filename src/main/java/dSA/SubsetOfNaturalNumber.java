package dSA;

import java.util.ArrayList;

public class SubsetOfNaturalNumber {
	
	public static void main(String[] args) {
		int n=3;
		ArrayList<Integer> subset = new ArrayList<>();
		findSubsets(n,subset);
	}

	private static void findSubsets(int n, ArrayList<Integer> subset) {
		if(n==0) {
			printSubset(subset);
			return;
		}
		//addhoga
		subset.add(n);
		findSubsets(n-1,subset);
		//add nhi hoga
		subset.remove(subset.size()-1);
		findSubsets(n-1,subset);
		
	}

	private static void printSubset(ArrayList<Integer> subset) {
		// TODO Auto-generated method stub
		for(int i=0;i<subset.size();i++) {
			System.out.print(subset.get(i)+" ");
		}
		System.out.println();
	}

}
