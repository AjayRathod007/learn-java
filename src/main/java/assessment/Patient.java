package assessment;

public class Patient {
	
	private String code;
	private String Name;
	private int age;
	private String doctorName;
	private double billAmount;
	
	public Patient(String code, String name, int age, String doctorName, double billAmount) {
		super();
		this.code = code;
		Name = name;
		this.age = age;
		this.doctorName = doctorName;
		this.billAmount = billAmount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Patient [code=" + code + ", Name=" + Name + ", age=" + age + ", doctorName=" + doctorName
				+ ", billAmount=" + billAmount + "]";
	}
	
	
	

}
