package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


public class TraverseExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("ajay");
		names.add("banti");
		names.add("ashu");
		names.add("golu");
		names.add("ajay"); 
		System.out.println(names);
		
		//for each loop
		
		for(String str:names) {
			System.out.print(str+"\t"+str.length()+"\t");
			
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		System.out.println("_____________________________________________________________");
		
		//traversing using ITERATOR - Forward Traversing
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		// BackWard Traversal  of collection LISTITERATOR
		
		ListIterator<String>lit=names.listIterator(names.size());
		while(lit.hasPrevious()) {
			String pre = lit.previous();
			System.out.println(pre);
		}
		
		
		System.out.println("+++++++++++++++++++++++  FOR   EACH METHOD    +++++++++++++++++++++++++++++++");
		//Enumeration
		
		//ForEach
		
		names.forEach(e->{
			System.out.println(e);
		});
		
		
		
		
		System.out.println("     SORTING  OF ELEMENTS                    ");
		
		
		TreeSet<String> tst= new TreeSet<>();
		tst.addAll(names);
		
		tst.forEach(str->{
			System.out.println(str);
		});
	}

}
