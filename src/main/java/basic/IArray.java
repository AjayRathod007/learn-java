package basic;

public class IArray {
public static void main(String[] args) {
	aj();
	
}
public static void aj() {
	int[][] student = {{70,65,90,56,35,24},{32,65,91,65,45},{98,75,89,65}};
	for(int i=0;i<student.length;i++) {
		System.out.println("Displaying of grades of students class:" + i + " :");
		
	
	int max=0;
	for(int j=0; j<student[i].length; j++ ) {
		if(student[i][j]>max) {
			max = student[i][j];
		}
		System.out.println("student[i][j]: " + student[i][j]);
	}
	System.out.println("\n max:" + max);
	
	}
}
}
