package collectionFramework;

import java.util.HashSet;
import java.util.Objects;

class Student{
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(rollNo, other.rollNo);
	}
	
}
public class HashSetCustomObject {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student("ajay",2));
		set.add(new Student("banti",1));
		set.add(new Student("ashu",2));
		set.add(new Student("golu",3));
		
		System.out.println(set);
		System.out.println(set.size());
	}
	

}
