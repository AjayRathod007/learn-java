package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(5);
		arr.add(7);
		
		for(int i=0;i<arr.size();i++) {
			
			System.out.print(arr.get(i));
			
		}
		int i=0;
		while(i<arr.size()) {
			System.out.print(arr.get(i));
		i++;
		}  
		
		for(Integer x: arr) {
			System.out.print(x);
		}
	}
}
