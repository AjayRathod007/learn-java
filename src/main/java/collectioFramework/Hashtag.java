package collectioFramework;


import java.util.*;
import java.io.*;

public class Hashtag {

	static int countHashTags(String post) {
		// write your code here
		int count = 0;
		
		//TO SEPERATE ALL WORDS IN LINE
		String[] arr = post.split(" ");
		
		for(String x : arr)
		{
			if(x.length()>2 && x.startsWith("#") && x.endsWith("#"))
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int T = scanner.nextInt();
			scanner.nextLine();
			String post;
			for (int testCases = 1; testCases <= T; testCases++) {
				post = scanner.nextLine();
				System.out.println(countHashTags(post));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
