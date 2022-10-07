package basic;

public class Student {
	static int computeCount;
	int id;
	String name;
	String gender;
	int age;
	double phone;
	double gpa;
	char degree;
	boolean international;
	double tutionFees = 12000.0;
	double internationalFees = 5000.0;

	void compute() {
		computeCount = computeCount + 1;
		int nextId = id + 1;

		if (international) {
			tutionFees = tutionFees + internationalFees;

		}
		System.out.println("\nid:" + id);
		System.out.println("nextId:" + nextId);
		System.out.println("name:" + name);
		System.out.println("gender" + gender);
		System.out.println("age" + age);
		System.out.println("phone" + phone);
		System.out.println("gpa" + gpa);
		System.out.println("degree" + degree);
		System.out.println("tutionFees" + tutionFees);
		System.out.println("computeCount" + computeCount);

	}

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.id = 1000;
		student1.name = "ajay";
		student1.gender = "male";
		student1.age = 27;
		student1.phone = 7828050630l;
		student1.gpa = 7.6;
		student1.degree = 'B';
		student1.compute();

		Student student2 = new Student();
		student2.id = 1000;
		student2.name = "honey";
		student2.gender = "female";
		student2.age = 24;
		student2.phone = 658;
		student2.gpa = 8.6;
		student2.degree = 'c';
		student2.compute();

	}
}
