package basic;

public class Array {
	public static void main(String[] args) {
		ajay();

	}

	public static void ajay() {
		System.out.println("\n inside the array....");

		/*
		 * int[] scores = new int[4]; scores[0] = 60; scores[1] = 70; scores[2] = 80;
		 * scores[3] = 100;
		 */
		// int[] scores = new int[] {90,70,80,100};

		int[] scores = { 50, 60, 70, 100 };

		System.out.println("mid-term1:" + scores[0]);
		System.out.println("mid-term1:" + scores[1]);
		System.out.println("final:" + scores[2]);
		System.out.println("project:" + scores[3]);
		System.out.println("# exams :" + scores.length);

		Student[] students = new Student[4];

		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();

		System.out.println("student 1:" + students[0]);
		System.out.println("student 2:" + students[1]);
		System.out.println("student 3" + students[2]);
		System.out.println("student 4" + students[3]);

	}

}
