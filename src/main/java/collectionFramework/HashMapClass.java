package collectionFramework;

import java.util.*;

public class HashMapClass {

	
	public static void main(String[] str)
	{
		
		HashMap<String,Integer> friends = new HashMap<>();
		friends.put("Ajay", 27);
		friends.put("Ashutosh", 29);
		
		
		
		System.out.println(friends);
		
		friends.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
		});
		
		
		
	}
	
}
