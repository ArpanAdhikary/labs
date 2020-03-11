package lab2.exercise5;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("Arpan","Adhikary",Gender.M,985645251);
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Gender: " + person.getGender());
		System.out.println("Phone Number: " + person.getPhoneNo());
		
	}

}
