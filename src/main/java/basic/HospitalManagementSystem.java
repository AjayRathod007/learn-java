package basic;

public class HospitalManagementSystem {
	private long id;
	private String firstName;
    private String lastName;
    private String gender;
    private String email;
    
    protected long getId() {
    	return id;
    }
    protected void setId(long id) {
    	this.id = id;
    }
    protected void setFirstName(String firstName) {
    	this.firstName = firstName;
    	
    }
    protected String getFirstName() {
    	return firstName;
    }
    protected void setLastName(String lastNAme) {
    	this.lastName = lastName;
    	
    }
    protected String getLastName() {
    	return lastName;
    	
    }
    protected void setGender(String gender) {
    	this.gender = gender;
    }
    protected String getGender() {
    	return gender;
    	
    }
    protected void setEmail(String email) {
    	this.email = email;
    }
    protected String getEmail() {
    	return email;
    }
}
