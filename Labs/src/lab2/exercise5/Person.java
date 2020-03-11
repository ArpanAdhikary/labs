package lab2.exercise5;

enum Gender
{
	M,F;
}

public class Person {

	private String firstName;
	private String lastName;
	private long phoneNo;
	Gender gender;
	Person() {
		
	}
	
	Person(String firstName,String lastName,Gender gender,long phoneNo) {
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}


