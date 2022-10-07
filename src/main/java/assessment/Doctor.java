package assessment;

import java.util.*;

public class Doctor {

	private String Doctor;
	private List<Patient> patientList;

	public Doctor(String doctor, List<Patient> patientList) {
		Doctor = doctor;
		this.patientList = patientList;
	}

	public static Patient findPatientWithMaximumAge(List<Patient> pl) {
		Patient maxAgePat = null;
		if (pl.size() == 0)
			return maxAgePat;

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < pl.size(); i++) {
			if (max < pl.get(i).getAge()) {
				max = pl.get(i).getAge();
				maxAgePat = pl.get(i);
			}
		}

		return maxAgePat;

	}

	public static List<Patient> sortPatientByBillAmount(List<Patient> pl) {
		if (pl.size() == 0) {
			return pl;
		}
		for (int i = 0; i < pl.size() - 1; i++) {
			for (int j = 0; j < pl.size() - 1; j++) {
				if (pl.get(j).getBillAmount() < pl.get(j + 1).getBillAmount()) {

				} else {
					Collections.swap(pl, j, j + 1);

				}
			}
		}

		return pl;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// CREAT N PATIENT OBJECTS
		List<Patient> patientList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String code = sc.next();
			String Name = sc.next();
			int age = sc.nextInt();
			String doctorName = sc.next();
			double billAmount = sc.nextDouble();

			patientList.add(new Patient(code, Name, age, doctorName, billAmount));

		}

		// CREATE DOCTOR OBJECT
		// String doctor = sc.next();
		Doctor dr = new Doctor("", patientList);
		Patient temp = findPatientWithMaximumAge(patientList);
		if(temp == null) {
			System.out.println("No Data Found");
		}
		else {
			System.out.println(temp.getCode());
			System.out.println(temp.getName());
			System.out.println(temp.getAge());
			System.out.println(temp.getDoctorName());
			System.out.println(temp.getBillAmount());
		}
		List<Patient> list = sortPatientByBillAmount(patientList);
		if(list.size()==0) {
			System.out.println("No Data Found");
		}else {

		for (Patient x : list) {
			System.out.println(x.getBillAmount());
		}
		}

	}

}
