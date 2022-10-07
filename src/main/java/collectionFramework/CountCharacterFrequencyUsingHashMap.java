package collectionFramework;

import java.util.HashMap;

public class CountCharacterFrequencyUsingHashMap {
	public static void main(String[] args) {
		String str="ajay";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)==true) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
			
		}
		
		System.out.println(map);
		map.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
			
		});
	}

}
