package lab2.exercise3;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("Arpan","Adhikary",'M');
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Gender: " + person.getGender());

	}

}
