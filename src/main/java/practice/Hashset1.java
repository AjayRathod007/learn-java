package practice;

import java.util.*;

class Test 
{
	private String name;
	private int id;
	
	public Test(String name, int id)
	{
		this.name=name;
		this.id=id;
	}

//	@Override
//	public int hashCode() {
//		if(this.name.length()==0)
//			return 0;
//		return Integer.valueOf(this.name.charAt(0));
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		
//		if (obj == null)
//			return false;
//		
//		Test other = (Test) obj;
//		
//		return (Objects.equals(name, other.name) && this.id==other.id);
//	}
	
	
	
}

public class Hashset1{
	
	public static void main(String[] arg)
	{
	
	HashSet<Test> h = new HashSet<>();
	
	Test a = new Test("ajay",1);
	Test b = new Test("ashu",2);
	Test c = new Test("ajay",1);
	
//    h.add(new Test("babd",1));
//    h.add(new Test("babd",2));
//    h.add(new Test("babd",1));
//    h.add(new Test("babd",4));
	h.add(a);
	h.add(c);
	h.add(b);
    
    System.out.println(h.size());
    
	}
	

}
