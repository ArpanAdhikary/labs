package lab2.exercise3;

public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	
	Person() {
		
	}
	
	Person(String firstName,String lastName,char gender) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
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


