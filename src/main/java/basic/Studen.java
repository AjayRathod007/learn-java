package basic;

	  
	  class Studen {
	      static int studentCount;
		  
	      int id;
		  String name;
		  String gender;
		  int age;
		  long phone;	  
		  double gpa;	  
		  char degree;
		  
		  boolean international;
		  double tuitionFees = 12000.0;
		  double internationalFees = 5000.0;
		  
		  
		  Studen(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
						char newDegree, boolean isInternational) {
			  id = newId;
			  name = newName;
			  gender = newGender;
			  age = newAge;
			  phone = newPhone;
			  gpa = newGpa;
			  degree = newDegree;
			  international = isInternational;
			  
			  studentCount = studentCount + 1;
			  int nextId = id + 1;		  
			  
			  if (international) {
			      tuitionFees = tuitionFees + internationalFees;
				  //return;
			  }	
			  
		      System.out.println("\nid: " + id);
			  System.out.println("nextId: " + nextId);
			  System.out.println("name: " + name);
			  System.out.println("gender: " + gender);
			  System.out.println("age: " + age);
			  System.out.println("phone: " + phone);
			  System.out.println("gpa: " + gpa);
			  System.out.println("degree: " + degree);
			  System.out.println("tuitionFees: " + tuitionFees);
			  System.out.println("studentCount: " + studentCount);
		  }
		  
		  Studen() {}
		

		  public static void main(String[] args) {
		      Studen student1 = new Studen(1000, "John", "male", 18, 22L, 3.8, 'B',false);
			  
			  Studen student2 = new Studen(1001, "Raj", "male", 21, 256L, 3.4, 'M', true);
			  
			  Studen student3 = new Studen(1002, "Anita", "female", 20,555L, 4.0, 'M', true);
			  
			  System.out.println("Studen.studentCount: " + Studen.studentCount);
		  }
	  }

