package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class ListCollection {
	public static void main(String[] args) {
		System.out.println("Welcome to code Java Collection frameWork");
		/*
		 * 1-typeSafe-same type of elements(objects) are added to collection
		 * 2- unTypeSafe-different types of elements can be added to collection
		 */
		
		// typeSafe collection
		ArrayList<String> names = new ArrayList<>();
		names.add("ajay");
		names.add("banti");
		names.add("ashu");
		names.add("golu");
		names.add("ajay"); 
		System.out.println(names);
		
		//get
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
		
		
		//remove
		names.remove(0);
		names.remove("golu");
		System.out.println(names);
		
		//size
		System.out.println(names.size());
		
		
		// contains-check items is there or not
		System.out.println(names.contains("ashu"));
		
		System.out.println(names.isEmpty());
		
		names.set(1, "ashish");
		names.add(1, "anoop");
		System.out.println(names);
		
		//remove all element
		//names.clear();
		
		System.out.println(names);
		
		Vector<String> vector = new Vector<>();
		
		vector.addAll(names);
		
		System.out.println(vector);
		
		
		System.out.println("________________________________________________________________");
		
		HashSet<Double> nms = new HashSet<>();
		
		nms.add(14.56);
		nms.add(236.568);
		nms.add((2354.235));
		nms.add(99.663);
		nms.add(99.663);
		nms.add(5.5);
		
		System.out.println(nms);
		
		System.out.println("________________________________________________________________________");
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		
		System.out.println(tset);
		
//		//UnTypeSafe
//		LinkedList list = new LinkedList();
//		list.add("ajay");
//		list.add("1224");
//		list.add(652.356);
//		list.add(true);
//		
//		System.out.println(list);
//		
	}

}
