package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		//insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		//size
		System.out.println(set.size());
		//search
		if(set.contains(1)) {
			System.out.println("1 is  it available");
		}
		//delete
		set.remove(1);
		
		System.out.println(set);
		
		//Iterator
		Iterator it = set.iterator();
		//it.next();
		//it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
