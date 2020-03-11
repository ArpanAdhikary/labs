package lab2.exercise4;

public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	private long phoneNo;
	Person() {
		
	}
	
	Person(String firstName,String lastName,char gender,long phoneNo) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
		setPhoneNo(phoneNo);
	}
	
	
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}


