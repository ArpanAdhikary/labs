package lab6.exercise1;

public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	
	Person() {
		
	}
	
	Person(String firstName,String lastName,char gender) throws FullNameException {
		if(lastName.equals("")==true && firstName.contentEquals("")==true)
			throw new FullNameException(firstName,lastName);
		
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


